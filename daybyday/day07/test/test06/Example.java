package test.test06;

public class Example {
    public static void main(String[] args) {
        Clerk clerk=new Clerk("李小亮", "销售部", "C001", "张小强");
        Manager manager=new Manager("张小强", "销售部", "M001", "李小亮");
        manager.print();
        clerk.print();
    }
}
