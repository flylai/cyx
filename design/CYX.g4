grammar CYX;

program: stmt+ EOF;

block: '{' stmt* '}';

type: 'int' | 'double' | 'string' | 'list';

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
	) ';'?;

expr:
	selfAddSub									# selfAddSubExpr // interpreter -> selfAddSub
	| expr op = ('*' | '/' | '%') expr			# mulDivModExpr
	| expr op = ('+' | '-') expr				# addSubExpr
	| expr op = ('>=' | '<=' | '>' | '<') expr	# cmpExpr
	| expr op = ('==' | '!=') expr				# eqExpr
	| op = '-' expr								# minusExpr
	| expr op = '&' expr						# bitANDExpr
	| expr op = '^' expr						# bitXORExpr
	| expr op = '|' expr						# bitORExpr
	| expr op = '&&' expr						# logANDExpr
	| expr op = '||' expr						# logORExpr
	| number									# numberExpr // interpreter -> visitNumberExpr
	| varFunExpr								# identifierExpr
	| funCall                                   # funCallExpr // functionCall -> funCall
	| STRING									# stringExpr
	| BOOL										# booleanExpr
	| '(' expr ')'								# subExprExpr;

selfAddSub: ID op = ('++' | '--');

returnStmt: ('return' expr? );

funCallStmt: funCall | buildInFunStmt;

buildInFunStmt:
	'print' '(' expr ')'		# printStmt
	| 'println' '(' expr ')'	# printlnStmt;

varFunExpr: funCall | varNameExpr;

funDeclStmt: funType ID '(' params? ')' block;
funType: 'fun' | 'void' | type;
params: param (',' param)*; // 声明时参数
param : type? ID;

funCall: ID '(' args? ')';
args: expr (',' expr)*; // 调用时参数

varNameExpr: ID subScripts?;
varDeclStmt: varType varNameExpr ('=' subList)?;
varType: 'var' | type;
varAssignStmt: varNameExpr '=' subList;

subScripts: subScript+; // [number][number][number]....
subScript: '[' expr ']'; // [number]

ifStmts: ifStmt elseifStmt* elseStmt?;
ifStmt: IF expr ':'? block;
elseifStmt: ELSE IF expr ':'? block;
elseStmt: ELSE ':'? block;

forStmt:
	FOR '(' varDeclStmt ';' cond = expr? ';' step = expr? ')' block
	// for (int i = 0; i < N; i++) {}
	| FOR '(' varAssignStmt ';' cond = expr? ';' step = expr? ')' block;
// for (i = 0; i < N; i++) {}

whileStmt: WHILE expr ':'? block;

number: INT | DECIMAL;

list:
	'[' subList (',' subList)* ']'; // [1,2,3,4,5,6,7,8,9] || [1,2,[3,4]]
subList: (expr | list);

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
//end

IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
BOOL: 'true' | 'false';
COMMENT: (
		'/*' ~('\r' | '\n')* '*/' // /* COMMENT */
		| '//' ~('\r' | '\n')* // // COMMENT
		| '#' ~('\r' | '\n')* // # COMMENT
	) -> skip;

ID: [_a-zA-Z] (LETTER | [0-9]+)*;
LETTER: [a-zA-Z];

INT: [0-9]+;
DECIMAL: INT ('.' [0-9]+)?;

STRING:
	["] (~["\r\n\\] | '\\' ~[\r\n])* ["]
	| ['] ( ~['\r\n\\] | '\\' ~[\r\n])* ['];

BLANK: [ \t\r\n] -> skip;
