package 类和对象的练习.编程题.test04;

public class Constructor {
    public static void main(String[] args) {
       Person zhangsan=new Person("张三", 33, 1.73);
       zhangsan.sayHello();
       Person lisi=new Person("李四", 44, 1.74);
       lisi.sayHello(); 
    }
}
