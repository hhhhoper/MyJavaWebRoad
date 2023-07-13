package day12.作业.num1;

public class E {
        public static void main(String[] args) {
                   ClassA a=new ClassA();
                   ClassB b=new ClassB();
                   processEvent(a, 4);
                   processEvent(b, 4);
        }
        public static void processEvent(InterfaceA a,int n){
                   if(a instanceof ClassA){
                       System.out.println("1-"+n+"累加:"+a.method(n));
                   }
                   else{
                       System.out.println("1-"+n+"阶乘:"+a.method(n));
                   }
        }
}
