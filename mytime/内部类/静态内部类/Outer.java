package 静态内部类;

public class Outer {
    static int m=0;
    static class Inner{
         void show(){
                   //静态内部类访问外部类成员
                   System.out.println("外部类静态变量m="+m);
         }
    }
}
