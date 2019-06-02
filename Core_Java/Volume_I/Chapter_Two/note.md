#第二章 Java程序设计环境

--------------------------------------------------

**Java核心技术第二章**

>* 安装Java开发工具包
>* 使用命令行工具
>* 使用集成开发环境
>* 运行图形化应用程序
>* 构建并运行applet

##2.1 安装Java开发工具包

###2.1.1

    下载JDK
* Java Development Kit（JDK）：编写Java程序的程序员使用的软件。
* Java Runtime Environment（JRE）：运行Java程序的用户使用的软件
* NetBeans：Oracle的集成开发环境。
* JDK工具包的版本1.2 ~ 1.4被称为 Java SDK（软件开发包，Software Development Kit）
* Java 2 这种提法始于1998年，Sun公司的销售人员感觉增加小数点后面的数值改变版本号并没有反映出JDK1.2的重大改进。但是发布之后才意识到这个问题，所以决定开发工具包的版本号仍然沿用1.2，接下来的版本是1.3、1.4 和 5.0。但是Java平台被重新命名为Java2。因此就有了 Java 2 Standard Edition Software Development Kit（Java2标准版软件开发包）的5.0版，即J2SE SDK 5.0。
* 2006年版本号得到简化。取名为 Java SE 6。不过内部版本号为1.6.0。
* JavaSE 8u31 是 Java SE 8的第31次更新，它的内部版本号为1.8.0_31。更新不需要安装在前一个版本上，它会包含整个JDK的最新版本。

###2.1.2

    设置JDK

* 路径名最好不要有空格
* 控制面板->系统与安全->系统->高级系统设置->系统属性->高级->环境->系统变量->Path->添加jdk安装目录（分号隔开）。
* 打开CMD窗口，输入`javac -version`，回车显示信息。

###2.1.3

    安装库源文件和文档

* 库源文件在JDK中以一个压缩文件src.zip的形式发布。库源文件包含了所有公共类库的源代码。想要获得更多的源代码，请访问[网站](http://jdk8.java.net)。
* 文档包含在一个压缩文件中，可以在[这里](http://www.oracle.com/technetwork/java/javase/downloads)下载
	* 文件名字为jdk-version-docs-all.zip,version表示版本号，如8u31。
	* 解压文件到javadoc。
	* 浏览器导航到javadoc/api/index.html,添加书签。
* 本书程序示例你可以在[这里](http://horstmann.com/corejava)下载。

##2.2 使用命令行工具

* 打开一个终端窗口
* 进入安装本书示例源代码的目录
* 键入如下命令
	
	* `javac Welcome.java `     
	* `java Welcome`

* Windows中使用命令`dir`查看文件。
* 在[这里](http://docs.oracle.com/javase/tutorial/getStarted/cupojava/)有一个很好的教程，提到了初学者经常容易犯的一些错误。

##2.3 使用集成开发环境

* Eclipse可以从[这里](http://eclipse.org/downloads)获取。
* Eclipse的使用：
	* 启动Ecplise之后从菜单选择File->New->Project
	* 选择 Java Project
	* 点击Finish
* Eclipse错误报告会伴有一个灯泡图标。点击这个图标可以得到一个建议解决这个错误的方案列表。

##2.4 运行图形化应用程序

* 编写并且运行ImageViewer程序。

##2.5 构建并运行applet

* 编写并运行RoadApplet.java程序。


------------------------------------------------------------------
作者：Ashesreborn

time：2019/6/2 23:14:30 