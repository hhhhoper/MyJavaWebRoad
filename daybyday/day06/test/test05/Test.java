package test.test05;

public class Test {
    public static void main(String[] args) {
       Manager manager=new Manager("James","9527", 15000, 3000);
       manager.showSalary();
       System.out.println("==========");
       Coder coder=new Coder("Kobe", 0025, 10000);
       coder.intro();
    }
}
