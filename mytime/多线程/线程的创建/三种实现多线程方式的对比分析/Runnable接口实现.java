package 三种实现多线程方式的对比分析;

//定义一个实现Runnable接口的实现类
class TicketWindow2 implements Runnable{
     private int tickets=100;
     public void run(){
            while(true){
                   if(tickets>0){
                       System.out.println(Thread.currentThread().getName()
                       +"正在发售第"+tickets--+"张票");
                   }
            }
     }
}
public class Runnable接口实现 {
      public static void main(String[] args) {
           //创建TicketWindow实例对象tw
           TicketWindow2 tw=new TicketWindow2();
           //分别创建4个线程对象同时进行命名,并开启线程
           new Thread(tw,"窗口1").start();
           new Thread(tw,"窗口2").start();
           new Thread(tw,"窗口2").start();
      }
}
