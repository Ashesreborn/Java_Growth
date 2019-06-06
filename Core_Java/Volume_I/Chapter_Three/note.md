#第三章 Java的基本程序设计结构

-------------------------------------------------------

**Java核心技术第三章**
>* 一个简单的Java应用程序
>* 注释
>* 数据类型
>* 变量
>* 运算符
>* 字符串
>* 输入输出
>* 控制流
>* 大数值
>* 数组

##3.1 一个简单的Java应用程序

> 这是一个简单的应用程序
> 
    public class FirstSample {
		public static void main(String[] args) {
			System.out.println("We will not user 'Hello, World!");
		}
	}

* **Java区分大小写**
* public 称为访问修饰符（access modifier），这些修饰符用于控制程序的其他部分对这段代码的访问级别。
* 定义类名字必须以字母开头，后面可以跟字母和数字的任意组合。
* 类名的标准命名规范：类名是以大写字母开头的名词。如果名字由多个单词组成，每个单词的第一个字母都应该大写（这种在一个单词中间使用大写字母的方式称为骆驼命名法。
* 源文件的名字必须与公共类的名字相同，并用.java作为扩展名。
* 当使用`java ClassName`运行已编译的程序时，Java虚拟机将从指定类中main方法开始执行
* Java中点号（.）用于调用方法。Java使用的通用语法是 object.method（parameters）。
* 对于一个方法，即使没有参数也需要使用空括号。

##3.2 注释

* Java中有 **3** 种标记注释的方法。
* //：注释内容从//开始到本行的结尾
* /* 和 */将比较长的内容注释括起来。不可以嵌套
* /** 和 */可以用来自动地生成文档。

##3.3 数据类型

>* Java是一种强类型语言。必须为每一个变量声明一种类型。
>* Java中一共有8种基本类型（primitive type），其中有4种整型、2种浮点型、一种用于表示Unicode编码的字符单元的字符类型char和一种用于表示真值的boolean类型。

###3.3.1 整型

>* int      4字节
>* short    2字节
>* long     8字节
>* byte     1字节 
>* 长整型数值有一个后缀L或l
>* 十六进制数值有一个前缀0x或0X
>* 八进制有一个前缀0
>* 从Java7开始，加上前缀0b或0B就可以写二进制数。同时也可以为数字字面量加下划线，Java编译器会去除这些下划线。
>* Java没有任何无符号（unsigned）形式的int、long、short或byte类型。

###3.3.2 浮点类型

>* float    4字节
>* double   8字节
>* float类型的数值有一个后缀F或f（例如，3.14F）。没有后缀F的浮点数值（如3.14）默认为double类型。
>* 在十六进制表示法中，使用p表示指数，而不是e。
>* 一个正整数除以0的结果为正无穷大。计算0/0或者负数的平方根结果为NaN。
>*浮点数值不适用与无法接受舍入误差的金融计算中，如果在数值计算中不允许有任何舍入误差，就应该使用BigDecimal类。

###3.3.3 char类型

>* Unicode转义序列会在解析代码之前得到处理。

###3.3.4 Unicode 和 char 类型

>* P34

###3.3.5 boolean

>* 整型与布尔值之间不能进行相互交换

##3.4 变量

>* Java中的 “字母” 和 “数字”的范围更大。字母包括 'A'~'Z'、'a'~'z'、'_'、'$'或在某种语言中表示字母的Unicode字符。数字包括'0'~'9'和在某种语言中表示数字的任何Unicode字符。
>* 但是'+'不呢个出现在变量名中。空格也不可以。
>* 变量名中的所有的字符都是有意义的，并且大小写敏感。变量名的长度基本上没有限制。
>* 如果想要知道那些Unicode字符属于Java中的 “字母”，可以使用Charactr类的isJavaIdentifierStart和isJavaIdentifierPart方法来检查。
>* 逐一声明每一个变量可以提高程序的可读性。

###3.4.1 变量初始化

###3.4.2 常量

>* Java中用关键字final指示常量。习惯上常量名使用大写。
>* 类常量：可以在一个类中的多个方法中使用的常量，可以使用一个static final设置一个类常量。

##3.5 运算符

>* 整数被0除将会产生一个异常，而浮点数被0除将会得到无穷大或NaN结果。

###3.5.1 数学函数与变量

>* Math类中的sqrt方法处理的不是对象，这样的方法被称为静态方法。
>* 在Java中，没有幂运算，因此需要借助于Math类的pow方法。语句为：double y = Math.pow（x，a）。y的值为x的a次幂。

###3.5.2 数值类型之间的转换

>* 如果两个操作数中有一个是double类型，另一个操作数就会转换为double类型
>* 否则，如果其中一个操作数是float类型，另一个操作数将会转换为float类型
>* 否则，如果其中一个操作数是long类型，另一个操作数将会装换为long类型。
>* 否则，两个操作数都将被转换为int类型。
>
>-----------------------------------------------------------------------------------

>* 无信息丢失的转换：
	>* byte  -> short
	>* short -> int
	>* chat -> int
	>* int -> long
	>* int -> double
	>* float -> double
>* 有精度损失的转换
	>* int -> float
	>* long -> float
	>* long -> double

###3.5.3 强制类型转换

>* 强制类型转换的语法格式丢是在圆括号中给出想要转换的目标类型，后面紧跟待转换的变量名。例如：`double y = 9.997；    int x = （int）y；`
>* 如果想对浮点数进行舍入运算，以便得到最接近的整数，那就需要使用Math.round方法。`double y = 9.997；      int x = （int）Math.round（y）；` 现在调用round的时候，人人需要使用强制类型转换（int）。其原因是round方法返回的结果为long类型。由于存在信息丢失的可能性，所以只有使用显式的强制类型转换才能够将long类型转换成int类型。

###3.5.4 结合赋值和运算符

>* `x+=4；`等价于 `x = x + 4；`（一般把运算符放置 **=**  号的左边），如果运算符得到一个值，其类型与左侧操作数的类型不同，就会发生强制类型转换。

###3.5.5 自增与自减运算符

>* 前缀形式会先完成加一；而后缀形式会使用变量原来的值。

###3.5.6 关系和boolean运算符

>* &&和||运算符是按照 “短路” 方式来求值的：如果第一个操作数已经能够确定表达式的值，第二个操作数就不必计算了。
>* `condition ？ expression1 ： expression2` 如果条件为true就为第一个表达式的值，否则计算为第二个表达式的值。

##3.5.7 位运算符

>* 处理 **整数** 类型时，可以直接对组成整数数值的各个位完成操作。这意味着可以使用掩码技术得到整数中的各个位。
>* 位运算符包括：
	>*  &（“and”）  
	>*  |（“or”） 
	>*  ^（“xor”） 
	>*  ~（“not”）

>* `>>>`运算符会用 **0** 填充高位，
>* `>>`运算符会用符号位填充高位。
>* 移位运算符的有操作数要完成模2的运算。

###3.5.8 括号与运算符级别

>* P45

###3.5.9 枚举类型

>* 枚举类型包括有限个命名的值。例如`enum Size {SMALL,MEDIUM, LARGE, EXTRA_LARGE}；`
>* 现在可以声明这种类型的变量：`Size s = Size.MEDIUM；` 
>* Size类型的变量只能存储这个类型声明中给定的某个枚举值。或者null值，null表示这个变量没有设置任何值。

##3.6 字符串

>* Java字符串就是Unicode字符序列。Java没有内置的字符串类型，而是在标准Java类库中提供了一个预定义类，很自然地叫做String。

###3.6.1 子串

>* String的substring芳可以从一个较大的字符串提取出一个子串。例如

	String greeting = "Hello";

	String s = greeting.substring(0,3);
>* substring方法的第二个参数是不想复制的第一个位置。
>* substring的公国方式有一个优点：容易计算子串的长度。字符串s.substring的长度为b-a。

###3.6.2 拼接

>* Java语言允许使用 **+** 号连接（拼接）两个字符串。
>* 当将一个字符串与一个非字符串的值进行拼接是，后者将被转换为字符串。这种特性通常用在输出语句中。例如：`System.out.println("The answer is " + answer);`
>* 如果需要把多个字符串放置一起，用一个定界符分隔，可以使用静态join方法：
	String all = String.join("/","S","M","L","XL");   ->("S/M/L/XL)

###3.6.3 不可变字符串

>* String类没有提供用于修改字符串的方法。在Java中修改字符串首先提取需要的字符，然后在拼接上替换的字符串：`greeting = greeting.substring(0,3) + "p!";`
>* 因为不能修改Java字符串中的字符，所以在Java文档中将String类对象称为不可变字符串。当然可以修改字符串变量greeting，让它引用另外一个字符串。
>* 不可变字符串有一个优点：编译器可以让字符串共享。

###3.6.4 检测字符串是否相等

>* 可以使用equals方法检测两个字符串是否相等。表达式`s.equals（t）`中相等返回true，否则返回false。s和t可以是字符串变量，也可以是字符串字面量。
>* 如果想检测两个字符串是否相等，而不区分大小写，可以使用equalsIgnoreCase方法。
>* **==** 运算符只能检测两个字符串是否放置在一个位置。
>* 如果虚拟机始终将相同的字符串共享，就可以使用 **==** 运算符检测是否相等。但实际上只有字符串常量是共享的，而 **+** 或 **substring** 等操作产生的结果并不是共享的。
>* Java的compareTo也可以检测是否相等，但是equals方法看起来更为清晰。

###3.6.5 空串与Null串

>* 空串`""`是长度为0的串，可以用以下方法检测：
>
	if（str.length（） == 0）
	或
	if（str.equals（""））
>* 空串是一个Java对象，有自己的串长度（0）和内容（空）
>*不过，String对象还可以存放一个特殊的值，名为null，这表示目前没有任何对象与该变量关联。可以用以下方法检测：`if（str == null）`
>* 有时要检查一个字符串既不是null也不为空串，这种情况下就需要使用以下条件：`if(str != null && str.length() != 0)`
	>* 首先要检查str不为null。如果在一个null值上调用方法，会出现错误。

###3.6.6 码点与代码单元

>* Java字符串由char值序列组成。char数据类型是一个采用UTF-16编码表示Unicode码点的代码单元。
>* 大多数常用的Unicode字符使用一个代码单元就可以表示，而辅助字符需要一对代码表示。
>* length方法将返回采用UTF-16比按摩表示的给定字符串所需要的代码单元
>* 要想得到实际的长度，即码点数量，可以调用：`int capCount = greeting.codePointCount(0,greeting.length());`
>* 调用s.charAt（n）将返回位置n的代码单元，n介于0 ~ s.length()-1之间。
>* 要想得到第i个码点，应该使用下列语句
	int index = greeting.offsetByCodePoint(0,i);
	int cp = greeting.codePointAt(index);
>* 使用codePoints方法将字符串转换为数组，`int[] codePoints = str.codePoints().toArray();`
>* 使用构造函数可以个将一个码点数组转换为一个字符串，`String str = new String(codePoints, 0, codePoints.length)`

###3.6.7 String API

>* -[] 码点与代码单元到底能做什么？
>* int compareTo(String other)
	>* 按照字典顺序，如果字符串位于other之前，返回一个负数；如果字符串位于other之后，返回一个正数，入股两个字符相等，返回0；
>* IntStream codePoints() 版本8
	>将这个字符串的码点作为一个流返回，调用toArray将它们放置一个数组中。
>* new String(int[] codePoints, int offset, int count ) 5.0
	>用数组中从offset开始的count个码点构造一个字符串。
>* boolean startWith(String prefix)
>* boolean endWith(String suffix)
	>* 如果字符串以suffix开头或者结尾，则返回true
>* int indexOf(Sting str)
>* int indexOf(String str, int fromIndex)
>* int indexOf(int cp)
>* int indexOf(int cp, int fromIndex)
	>* 返回与字符串str或者代码点cp匹配的第一个子串的开始位置。这个为位置从索引0或fromIndex开始计算。如果在原始串中不存在str，返回-1。
>* String replace(CharSequence oldString, CharSequence newString)
	>* 返回一个新字符串。这个字符串用newString代替原始字符串中所有的oldString。可以用String或StringBuilder对象做为CharSequence参数。
>* String SubString（int beginIndex)
>* String SubString(int beginIndex, int endIndex)
>* String toLowerCase()
>* String toUpperCase()
>* String trim()
	>返回一个新字符串。这个字符串将商城了原始字符串头部和尾部的空格。
>* String join(CharSequence delimiter, CharSequence...elements) 8
	>* 返回一个新字符串，用给定的定界符连接所有元素。

###3.6.8 阅读联机API文档

>* 

###3.6.9 构建字符串

>* 有时候需要由较短的字符串构建字符串，例如按键或来自文件中的单词，采用字符串连接的方式达到慈母的的效率比较低。每次连接字符串，都会构建一个新的字符串，既耗时又浪费空间。使用StringBuilder类就可以避免这个问题的发生。
>* 如果需要用很多小段的字符串构建一个字符串，按如下步骤：
	>* 首先创建一个空的字符构建器：
	>* `StringBuilder builder = new StringBuilder();`
	>* 当每次需要添加一部分内容时，就调用append方法。
	>* `builder.append(ch);//appends a single character`
	>* `builder.append(str);//appends a string`
	>* 在需要构建字符串时就调用toString方法，将可以得到一个String对象，其中包括构建器中的字符序列。
	>* `String completedSting = builder.toString();`
>* 在JDK5.0中引入StringBuilder类。这个类的前身是StringBuffer，其效率稍有些低，但允许采用多线程的方式执行添加或删除字符的操作。。如果所有字符串在一个单线程中编辑（通常是这样），则应该用`StringBuilder`替代它。这两个类的API是相同的。
>* java.lang.StringBuilder 5.0
>* StringBuilder()
	>* 构建一个空的字符串构建器
>* P55

##3.7 输入输出

###3.7.1 读取输入

>* 要想通过控制台进行输入，首先需要构造一个Scanner对象，并与 “标准输入流” System.in 关联。
	>* `Scanner in = new Scanner(System.in)`
	>* `System.out.print("What is your name?")`;
	>* `String name = in.nextLine()`:
	>* --------------------------------------------------------
	>* 在这里使用nextLine()是因为在输入行中可能包含空格。要想读取一个单词(以空格作为分隔符)，就调用
	>* `String firstName = in.next();`
	>* 要想读取一个整数，就调用nextInt方法。
	>* `System.out.print("How old are you?");`
	>* `int age = in.nextInt();`
	>* 要想读取下一个浮点数，就调用nextDouble方法。
>* Scanner类定义在java.util包中。当使用的类不是定义在及泵java.lang包中是，一定要使用import指示字符将对应的包加载进来。
>* 因为输入是可见的，所以Scanner类不适用于控制台读取密码。Java SE 6特别引入了Console类实现这个目的。要想读取一个密码，可以采用以下的代码。

	```
	Console cons = System.console();
	String username = cons.readLine("User name: ");
	Char[] passwd = cons.readPasswd(Passwd: );
	```
>* java.io.Console 6
	>* static char[] readPassword(String prompt, Object... args)
	>* static String readLine(String prompt, Object...args)
	>* 显示字符串prompt并且读取用户输入，知道输入行结束。args参数可以用来提供输入格式。

###3.7.2 格式化输出

>* Java SE 5.0 沿用了C语言库函数中的printf方法。例如调用`System.out.printf("%8.2f",x);` 可以用8个字符的宽度和小数点后两个字符的精度打印x。
>* 可以使用静态的String.format方法创建一个格式化的字符串，而不打印输出：
>* `String message = String.format("Hello, %s.Next year ,you'll be %d", name, age);`
>* 在新代码中，应该使用卷||第6章中介绍的java。time包的方法。不过你可能会在遗留代码中看得Date类和相关的格式化选项。 
>* 格式包括两个字母，以 **t** 开始，以表中的任意字母结束。例如：`System.out.printf("%tc", new Date());`
	>* c 完整的日期和时间
	>* F ISO 8061日期
	>* D 美国格式的日期（月/日/年）
	>* T 24小时时间
	>* r 12小时时间
	>* R 24小时时间没有秒
	>* ...
###3.7.3 文件输入与输出

>* 要想对一个文件进行读取，就需要一个File对象构造一个Scanner对象。如下
>* `Scanner in = new Scanner(Paths.get("myfile.txt"),"UTF-8);`
>* 如果文件名中包含反斜杠符号，就要记住在每个放血个之前再加一个额外的反斜杠：`“c:\\mydirectory\\myfile.txt” `.
>* 要想写入文件就需要构造一个PrintWriter对象。在构造器中，只需要提供文件名：
>* `PrintWriter out = new PrintWriter("myfile.txt","UTF-8");`
>* 如果文件不存在则创建该文件。
>* 可以用下列命令找到当前路径的位置：
>* `String dir = System.getProperty("user.dir");`
>* java.nio.file.Paths 7
	>*  static Path get(String pathname)
	>* 根据给定的路径名构造一个Path。

##3.8 控制流程

>* Java中没有goto语句，但break语句可以带标签，可以利用它实现从内存循环跳出的目的。

###3.8.1 块作用域

>* 块(即复合语句)是指有一对大括号括起来的若干条简单的Java语句。块确定了变量的作用域。一个块可以嵌套在另一个块中。
>* **不能** 在嵌套的两个块中声明同名的变量。无法通过编译。

###3.8.2 条件语句

>* if条件语句格式为：`if(conidtion) station`
>* else语句与最邻近的if构成一组

###3.8.3 循环

>* while条件语句格式为：`while(conditon) statement`

###3.8.4 确定循环

>* 

###3.8.5 多重选择： switch语句

>* case标签可以是：
	>* 类型为char、byte、short或int的常量表达式
	>* 枚举常量
	>* 从Java SE 7开始，case标签海可以是字符串字面量。

###3.8.6 中断控制流程语句

>* 标签必须放在希望跳出的最外层循环之前，并且必须紧跟一个冒号。
>* 只能跳出语句块而不能跳入语句块。
>* continue语句将控制转移到最内存循环的首部。

##3.9 大数值

>* 如果基本的整数和浮点数精度不能够满足需求，那么可以使用java.math包中的两个很有用的类：`BigInteger`和`BigDecimal`。
	>* 这两个类可以处理包含任意长度数字序列的数值。
	>* BigInteger类实现了任意精度的整数运算，BigDecimal实现了任意精度的浮点数运算。
>* 使用静态的valueOf方法可以将普通的数值转换为大数值：
>* `BigInteger a = BigInteger.valueof(100);`
>* **遗憾的是** ， 不能使用人民熟悉的算术运算符(如： **+**和 *)处理大数值，而需要使用大数值类中的add和mutiply方法。
>* `BigInteger c = a.add(b); c=a+b`
>* `BigInteger d = c.mutiply(b.add(Biginteger.valueof(2))); //d = c * (b + 2)`

##3.10 数组

>* 数组的长度不要求是常量：new int[n]会创建一个长度为n的数组。
>*可以使用下面两者形式声明数组：
	>* `int[] a;`
	>* 或
	>* `int a[];`

>* 创建一个数字数组时，所有元素都初始化为0。
>* boolean数组的元素会初始化为false。
>* 对象数组的元素则初始化为一个特殊值null，表示这些元素（还）未存放任何对象

###3.10.1 for each循环

>* 格式为：`for(variable : collection) statement`
	>* collection这一集合表达式必须是一个数组或者是一个实现了Iterable接口的类对象。

>* for each循环语句的循环变量将会遍历数组中的每个元素，而不需要使用下标值。
>* 有个更加简洁的方式打印数组中的所有值，即利用Arrays类的toString方法。调用Array.toString（a），返回一个包含数组元素的字符串，这些元素被放置在括号内，并用逗号分隔，例如，"[2,35,7,11,13]".
>* **要打印数组**，可以调用：
	>* `System.out.println(Arrays.toString(a));`

###3.10.2 数组初始化以及匿名数组

>* 创建数组对象并同时赋予初始值的简化书写形式。
	>* int[] smallPrimes = {2, 3, 5, 7, 11, 13};
>* 甚至可以初始化一个匿名数组：
	>* new int[] {17,19,23,29,31,37}
	>* 这种表示法将创建一个新数组并利用括号中提供的值进行初始化，数组的大小就是初始化值的个数。
	>* 使用这种语法形式可以在不创建新变量的情况下重新初始化一个数组。例如：
	>* `samllPrimes = new int[] {178,19,23,29,31,37};`
>* 在Java中，允许数组长度为0。

###3.10.3 数组拷贝

>* 在Java中，允许将一个数组变量拷贝给另一个数组变量。这是，两个变量将引用同一个数组。
>* 如果希望将一个数组的所有值拷贝到一个心得数组中去，就要使用Arrays类的copyOf方法：
	>* `int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);`
	>* 第二个参数是新数组的长度。这个方法庸才用来增加数组的大小。

###3.10.4 命令行参数

>* 在Java应用程序的main方法中，程序名并没有存储在args数组中。

###3.10.5 数组排序

>* 要想对数值下数组进行排序，可以使用Arrays类中的sort方法。`Arrays.sort(a);`
	>* 这个方法使用了优化的快速排序算法

>* Math.random方法将返回一个0到1之间(包含0、不包含1)的随机浮点数。
	>* 用n乘以这个浮点数，就可以得到从0到n-1之间的一个随机数。