 

1.课程回顾
	1）方法定义调用
		有参有返回值的方法
		public static 返回值类型 方法名(形参列表){
			功能代码；
		}
		有参无返回值的方法
		public static void 方法名(形参列表){
			功能代码；
		}
		无参有返回值的方法
		public static 返回值类型 方法名(int num){
			功能代码；
		}
		无参无返回值的方法(黑洞方法)
		public static void 方法名(){
			功能代码；
		}
	2）值传递和引用传递
	3）方法重载：
		首先，在一个类中，方法名一样，参数列表不同。
		

	4）类和对象
		类是描述一类事物
		对象是类的具体实例
	
	5）类和对象的关系
		类是创建对象的蓝图
		对象是类的具体实例
=======================================

### 1.构造器(构造方法)

​	无参构造器语法格式:
​			public 类名(){
​				功能代码；
​			}
​	有参构造器语法格式:
​			public 类名(属性列表){
​				功能代码；
​			}

### 2.构造器的调用：就是创建对象的语法

​	 new 类名();
​	 类名 对象名  = new 类名();

3.构造器的作用：
	 无参构造器:就是创建对象的
	 有参构造器:创建对象并且给属性赋值

### 4.构造方法的特点：

​	a）方法名和类名相同
​	b）不含返回值类型，void也不允许存在
​	c）不能在构造器中写return语句
​	d）访问权限一般都是public
​	e）如果程序员创建一个类,系统提供一个默认的无参构造器

注意事项：
	如果提供有参构造器，会把默认的无参构造器覆盖掉，所以
	常用开发方式，就是有参，无参全部提供。

生成构造器:
	alt+shift+s-->generate constructor using fields

练习：
	根据步骤实现功能
	1）创建Employee类
	2）属性:
		员工编号、员工姓名、员工职务、员工薪资
	3）提供有满参构造器/无参构造器
	4）定义修改员工薪资的方法
	5）定义打印员工详细信息的方法
	6）创建测试类：
		创建员工并且进行功能测试。

5.对象创建内存模型
	在java中所有的变量、数组、对象都是分配到内存空间中。
	根据变量类型不同分配内存也有所不同。

	内存类别:
		栈stack:
			栈内存存取速度快,存储基本数据类型的数据和引用类型的引用
		堆heap:
			堆可以保存哪些对空间要求较大的数据

6.匿名对象： 
	new 类名(实参列表).方法名(实参列表);
	例如:
	new Employee();

###  7.this关键字

 	this有两种用途
	第一种：引用实例变量
	第二种用途:在构造方法中，通过this引用其它的重载构造方法
	当方法中的参数与某个实例变量有相同名字时，这时，局部变量优先显示,实例变量被隐藏.就可以使用this来指定实例变量.this关键字代表的是对象自身的引用.this是一个引用，指向调用该方法的当前对象.

	使用场景：
		a）一是方法中的变量和属性名相同
		b）在构造方法中，通过this引用其它的重载构造方法
		3）返回当前对象的引用