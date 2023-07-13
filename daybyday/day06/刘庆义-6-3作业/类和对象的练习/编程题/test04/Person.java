package 类和对象的练习.编程题.test04;

public class Person {
    String name;
    double hight;
    double height;
    int age;
    public Person(){}
    public Person(String name,int age,double hight){
                   this.height=height;
                   this.hight=hight;
                   this.name=name;
                   this.age=age;
    }
    public void sayHello(){
        System.out.println("hello,my name is "+name);
    }
}
