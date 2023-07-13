
class Person{
    //下面定义finalsize()方法会在垃圾回收前调用
    public void finalize(){
        System.out.print("对象将被作为垃圾回收");
    }
}

public class Example37{
    //1.演示一个不通知强制垃圾回收的方法
    public static void recyclegWastel(){
                 Person p1=new Person();
                 p1=null;
                 int i=1;
                 while(i<10){
                    System.out.println("方法1循环中...");
                    i++;
                 }
    }
    //2.演示一个通知强制垃圾回收的方法
public static void recyclegWaste2(){
    Person p2=new Person();
    p2=null;
    //通知垃圾回收器进行强制垃圾回收
    System.gc();
    //Runtime.getRuntime().gc();
    int i=1;
    while(i<10){
        System.out.println("方法2循环中....");
        i++;
    }
}
public static void main(String[] args) {
    //分别调用两个模拟演示垃圾回收的方法
    recyclegWastel();
    System.out.println("================");
    recyclegWaste2();
}
}

