package test.test1;

public class Test1 {
     public static void main(String[] args) {
             Employee em=new Employee(1, "张三", "打工人",10000);
             em.editSalary(20000);
             em.printInfo();
     }
}
