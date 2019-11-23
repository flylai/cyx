grammar CYX;

program: stmt* EOF;

block: '{' stmt* '}';

type: 'int' | 'double' | 'string' | 'list' | 'bool';

stmt:
	(
		block
		| funDeclStmt // function
		| funCallStmt //
		| varDeclStmt
		| varAssignStmt
		| ifStmts //if stmts
		| forStmt // for stmt
		| whileStmt // while stmt
		| returnStmt
		| selfAddSub
		| continueStmt
		| breakStmt
	) ';'?;

expr:
	selfAddSub									# selfAddSubExpr // interpreter -> selfAddSub
	| expr op = ('*' | '/' | '%') expr			# binaryExpr //mulDivModExpr
	| expr op = ('+' | '-') expr				# binaryExpr //addSubExpr
	| expr op = ('>=' | '<=' | '>' | '<') expr	# binaryExpr //cmpExpr
	| expr op = ('==' | '!=') expr				# binaryExpr //eqExpr
	| expr op = '&' expr						# binaryExpr //bitANDExpr
	| expr op = '^' expr						# binaryExpr //bitXORExpr
	| expr op = '|' expr						# binaryExpr //bitORExpr
	| expr op = '&&' expr						# binaryExpr //logANDExpr
	| expr op = '||' expr						# binaryExpr //logORExpr
	| op = '-' expr								# unaryExpr
	| op = '!' expr								# unaryExpr
	| number									# numberExpr // interpreter -> visitNumberExpr
	| varFunExpr								# identifierExpr
	| funCall									# funCallExpr // functionCall -> funCall
	| STRING									# stringExpr
	| BOOL										# booleanExpr
	| '(' expr ')'								# subExprExpr;

selfAddSub:
	ID op = ('++' | '--')	# postSelfCalc
	| op = ('++' | '--') ID	# preSelfCalc;

returnStmt: ('return' expr?);

funCallStmt: funCall | buildInFunStmt;

buildInFunStmt:
	'print' '(' expr? (',' expr)* ')'		# printStmt
	| 'println' '(' expr? (',' expr)* ')'	# printlnStmt;

varFunExpr: funCall | varNameExpr;

funDeclStmt: funType ID '(' params? ')' block;
funType: 'fun' | 'void' | type;
params: param (',' param)*; // 声明时参数
param: type? ID;

funCall: ID '(' args? ')';
args: expr (',' expr)*; // 调用时参数

varNameExpr: ID subScripts?;
varDeclStmt: varType varNameExpr ('=' subList)?;
varType: 'var' | type;
varAssignStmt: varNameExpr '=' subList;

subScripts: subScript+; // [number][number][number]....
subScript: '[' expr ']'; // [number]

ifStmts: ifStmt elseifStmt* elseStmt?;
ifStmt: IF expr ':'? stmt;
elseifStmt: ELSE IF expr ':'? stmt;
elseStmt: ELSE ':'? stmt;

forStmt:
	FOR '(' varDeclStmt ';' cond = expr? ';' step = expr? ')' stmt
	// for (int i = 0; i < N; i++) {}
	| FOR '(' varAssignStmt ';' cond = expr? ';' step = expr? ')' stmt;
// for (i = 0; i < N; i++) {}

whileStmt: WHILE expr ':'? stmt;

number: INT | DECIMAL;

list:
	'[' subList (',' subList)* ']'; // [1,2,3,4,5,6,7,8,9] || [1,2,[3,4]]
subList: (funCall | expr | list);

//operators
SELFADD: '++';
SELFSUB: '--';
MUL: '*';
DIV: '/';
MOD: '%';
ADD: '+';
SUB: '-';
GE: '>=';
LE: '<=';
GT: '>';
LT: '<';
EQ: '==';
NEQ: '!=';
BAND: '&';
BXOR: '^';
BOR: '|';
LAND: '&&';
LOR: '||';
LNOT: '!';
//end

IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
BOOL: 'true' | 'false';
breakStmt: 'break';
continueStmt: 'continue';

COMMENT: (
		'/*' .*? '*/' // /* COMMENT */
		| '//' ~('\r' | '\n')* // // COMMENT
		| '#' ~('\r' | '\n')* // #  COMMENT
	) -> skip;

ID: [_a-zA-Z] (LETTER | [0-9]+)*;
LETTER: [a-zA-Z];

INT: [0-9]+;
DECIMAL: INT ('.' [0-9]+)?;

STRING:
	["] (~["\r\n\\] | '\\' ~[\r\n])* ["]
	| ['] ( ~['\r\n\\] | '\\' ~[\r\n])* ['];

BLANK: [ \t\r\n] -> skip;
