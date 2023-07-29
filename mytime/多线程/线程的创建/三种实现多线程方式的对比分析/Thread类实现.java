package 三种实现多线程方式的对比分析;

 class TicketWindow extends Thread{
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

public class Thread类实现{
      public static void main(String[] args) {
             //分别创建4个线程对象TicketWindows并开启,来模拟4个售票窗口
             new TicketWindow().start();
             new TicketWindow().start();
             new TicketWindow().start();
             new TicketWindow().start();
      }
}
