package 多线程.多线程同步;
//定义SaleThread3类实现Runnable接口
class SaleThread extends Thread{
    private int tickets=10;
    public void run(){
         while(true){
              saleTicket();  //调用售票方法
         }
    }
    private synchronized void saleTicket(){
         if(tickets>0){
                   try{
                       Thread.sleep(100);
                   }catch(InterruptedException e){
                         e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName()+tickets--+"张票");
         }
    }
}
public class _3同步方法 {
    public static void main(String[] args) {
           SaleThread saleThread=new SaleThread();
           //创建并开启4个线程，模拟4个售票窗口
           new Thread(saleThread,"窗口1").start();
           new Thread(saleThread,"窗口2").start();
           new Thread(saleThread, "窗口3").start();
           new Thread(saleThread,"窗口4").start();                                                                                                                                                                                                                                                                                                                                                                                                     
           
    }
}
