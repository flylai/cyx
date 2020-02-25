# 语法指南

## 1. 开始

### 1.1 介绍

**CYX**是一个简单的脚本语言，支持动态类型，语法类似于**C**家族的其他语言( `C/Java/Python/PHP/JS` 等)，根据我个人爱好制定的语法规则，无 `main` 函数，**自顶向下逐行**解析运行，如果熟悉`C`系语言，那么使用这个脚本语言写个 `Hello World` 不是什么问题。

#### 1.2 注释

CYX 支持单行的 `//` 注释、 `#` 注释，多行的 `/*.....*/` 注释。

#### 1.3 数据类型

CYX 支持 `bool`, `int` , `double`, `string`, `list` 5种数据类型，内部实现与`Java`一致

`bool` : `true` 和 `false` 

特别的，对于**非0数字**，**有长度的string**，**有元素的list**以及**bool类型的true**，均为**true**

`int` : `1`, `2`, `3`, `100`, `65535` 等

`double` : `1.1`, `1.11`, `1.111`, `65535.65535` 等

`string ` : 支持 `'str"str"str'` 和 `"str'str'str"` 

`list` : `[1]`, `[1,2]` , `[1,2,[3,4],5]`, `[1,[2,3,[4,5]]]` , `[1,true,3.14,[str,[2,3]]]` 等

**list** 元素的类型可为提到的任意一种基本数据类型，包括其本身，其内部实现为 JAVA 的 arraylist

#### 1.4 变量

变量的类型声明与数据类型相同，并且可以使用 `var` 来使用动态类型，无论之前声明的是何种类型，都可以在之后的重新赋值中赋予新的类型。类型检查仅在赋值的时候工作。

```c++
int a = 1
bool b = true
double c = 3.1415926535
string d = "str"
string e = 'str'
list f = [1,2,3,4,5,[6,7]]
var g = 1
a = "str" // 类型更改
```

**特别的**，对于 `var` 声明的变量没有指定值时，为 `null`

## 2. 运算符

### 2.1 常用运算符

`+,-,*,/,%,&,|,^` 均支持，运算规则与顺序和 `Java` 一致，后三个为位运算符

在 `int`, `double` 前加 `-` 可取它的相反数

```c++
int a = 1
print(-a) // -1
double b = -1.1
print(-b) // 1.1
```

### 2.2 特殊运算

`+` 除了在正常数学运算中行驶它的职能外，在所有print函数中均可将数据转为string进行输出，也就是说，在一些特定情形下，`+`会使得数据类型变为string

```c++
int a = 1
string b = 'str'
a + b // 1str
bool c = false 
a + c // 1false
b + c // strfalse
```

特别的，`list` + 一个变量的时候，这个变量会加入到list中去

``` c++
list a = [1,2]
a + true // [1,2,true]
a + 'str' // [1,2,'str']
a + [1,2,3] // [1,2,1,2,3]
```

`-` 除了正常的数学运算外，对list的元素有删除作用

```c++
list a = [1,2,3]
var b = a - 2 // b = [1,3]
list c = [1,1,1,1,1]
print(c - 1) // [1,1,1,1]
list d = [1,2,3,1]
print(d - 1) // [2,3,1]
```

相同的，`*` 也有它自己的一些特点

```c++
string a = 's'
s * 3 // sss
s * 4 // ssss
```

### 2.3 逻辑运算

`&&`, `||`, `!` 与`Java` 中一致

```c++
print(true && true) // true
print(true || false) // false
print(!false) // true
print(!(!(false))) // false
```



### 2.4 条件运算

同样的 `==`, `！=`, `>`, `<`, `>=`, `<=` 与 `Java` 中一致 



## 3. 控制流

### 3.1 条件控制语句

`if` 语句支持 `if...else`, `if...else if...else`, 在多个 `if` 和单个 `else` 中，`else` 均对应其最近的 `if`，条件控制语句有多种花样写法

```c++
if condition 
    statement
else :
    statement
    
if (condition) {
    statements
} else if condition :
    statement
else : {
    statements
}
```

对于语句来说，`:` , `(....)` 可有可无，如果有花括号，则支持多条语句，如果没有，则只会执行一条语句

当然，形如

```c++
if condtion
    if condition
        if condition
            statement
        else
            statement
```

也是被允许的

### 3.2 循环

#### 3.2.1 for 循环

`for` 循环类似与 `C` 家族语言的编写方式，但是第一条语句不能为空，并且只能为变量声明或者变量赋值语句，剩下俩个语句可随意

```c++
int i = 0
for (i = 0; i < 5; i++){
    // do something...
}

for (int i = 0; i < 5; i++){
    // do something...
}

for (i = 0; ; ) {}
for (i = 0; ; i++) {}
for (i = 0; i < 10; ) {}
```

同样的，`for` 也可以不写***大括号***

```c++
for (int j = 0; j < 5; j++)
    for (int k = 0; k < 5; k++)
        for (int l = 0; l < 5; l++)
            // 125 times 
```

#### 3.2.2 while 循环

写法与大多数语言一致

```c++
while condition {
    // do something
}

while condition
    statement

while condition :
{}
```

冒号，括号，大括号语法同 `if`

### 3.3 返回与跳转

CYX 有3种结构化跳转方式，作用效果与其他语言一致

* `return` 默认直接返回
* `break` 终止离他最近的那层循环
* `continue` 不管接下来的语句，直接开始新一轮循环

## 4. 函数

### 4.1 普通函数

函数的返回支持上述所有数据类型，同时，也可以使用 `fun` 关键字引导函数定义，与 `if`, `while` 不同的是，函数的 **大括号** 是 **必须 **的

特别的: 对于形参，数据类型可写可不写，目前不会进行类型检查

```c++
// 求阶乘
int fac(int n) {
    if n >= 1
        return n * fac(n - 1）
    else
       return 1 
}

for (int i = 0; i <= 10; i++)
    println(fac(i))
```

### 4.2 匿名函数

类似于 `JavaScript` 的 `function(){}` 函数，详情: [匿名函数](https://developer.mozilla.org/zh-CN/docs/Glossary/Function)

该函数以 fun() 为关键字开始， 后接 => expr 或者 { do something } 

```js
// 对于语句块 可以这么写
var a = fun() {
    print("called")
    return 1
}
// 此时 a 的值为 1，并且打印了 called 

// 对于单一表达式
var a = fun() => 1
print(a) // 1
```

值得注意的是:  `()` 内不能写有任何参数



### 4.3 lambda 表达式

lambda 表达式由 `[]()` 引导，`[]` 内为形参，`()` 内为实参，他们的长度必须一致，否则将会报错

与普通函数相同的是: 对于形参，数据类型可写可不写，不会进行类型检查

与 匿名函数 一样 `[]()` 可以后接 => expr 或者  { do something } 

当然，当 `[]()` 均为空的时候，作用与 `匿名函数`相同

```c++
var a = [a,b,c](1,2,3) {
    if (a == 1)
        println(1)
    if (a > 2)
        println(2)
    else println(2.2)
    return a+b+c
}
println(a) 
/*
1
2.2
6
*/
var b = []() => 1
print(b) // 1
```





## 5. 其他

### 5.1 输出函数

CYX 支持 `print` 和 `println` 两种输出函数，与函数名一致，`println` 会附加换行，并且支持以 `,` 隔开的多表达式输出

```c++
print(1,2,3) // 123
println(1,2,3)
/*
1
2
3
*/
```

同样的，`print` 里也可以调用函数

```c++
fun example() {
    return 998
}
print(example()) // 998
```

### 5.2 一些可能有用的

对于每条语句后面的 `;` 可以写也可以不写

```c++
fun q(){
    return 2
}
var x = q()
print(x) // 2
```

CYX 同样支持自增自减运算符

```c++
var a = 2
print(a++) // 2
a = 2
print(--a) // 1

a = 3.14
print(a--) // 3.14
a = 3.14
print(++a) // 4.14 
```

对于 `list` 的元素访问和更改

```c++
list a = [1,2,[4,5],[6,[7,[8],9]]]
a[1] = 998 // [1,998,[4,5],[6,[7,[8],9]]]
a[2][0] = 0 // [1,998,[0,5],[6,[7,[8],9]]]
a[3][1][1] = 1 // [1,998,[0,5],[6,[7,[1],9]]]
print(a[1]) // 998
print(a[2]) // [4,5,]
print(a[3]) // [6,[7,[8,],9,],]
```

对于普通函数, 可在函数内继续声明函数

```c++
int i = 0
fun a(int i) {
    fun b() { i++ }
    fun c() { 
        fun d() {
            i++
        }
        d()
        i++
    }
    b()
    c()
    i++
    println(i)
}
a(1) // 5
```

