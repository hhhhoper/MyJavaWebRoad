package test.test1;
/*
 * 练习：
	根据步骤实现功能
	1）创建Employee类
	2）属性:
		员工编号、员工姓名、员工职务、员工薪资
	3）提供有满参构造器/无参构造器
	4）定义修改员工薪资的方法
	5）定义打印员工详细信息的方法
	6）创建测试类：
		创建员工并且进行功能测试。
 */
public class Employee {
       public int num;//员工编号
       public String name;//员工姓名
       public String position;//员工职务
       public double salary;//员工薪资
       public Employee(int num,String name,String position,double salary){
	this.num=num;
	this.name=name;
	this.position=position;
       }
       public void editSalary(double salary){
                   this.salary=salary;
       }
       public void printInfo(){
	System.out.println("编号:"+num+" 姓名:"+name+
	" 职务:"+position+" 薪资:"+salary+"$");
       }
}
