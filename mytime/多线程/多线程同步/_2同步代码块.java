package 多线程.多线程同步;
class SaleThread implements Runnable{
   private int tickets=10;
   Object lock=new Object();  //定义任意一个对象，用作同步代码块的锁
   public void run(){
         while(true){
                   synchronized(lock){
                         if(tickets>0){
                             try{
                                      Thread.sleep(100);  //模拟售票耗时过程
                             }catch(InterruptedException e){
                                      e.printStackTrace();
                             }
                             System.out.println(Thread.currentThread().getName()+"正在发售第:"+tickets--+"张票");
                         }
                   }                                                                                     
         }
   }
}
class Example{
     public static void main(String[] args) {
      SaleThread saleThread=new SaleThread();
     //创建四个线程,模拟4个售票窗口
     new Thread(saleThread,"窗口1").start();
     new Thread(saleThread,"窗口2").start();
     new Thread(saleThread,"窗口3").start();
     new Thread(saleThread,"窗口4").start();

     }
}