package 多线程.多线程同步;

import java.util.concurrent.locks.*;;

//定义LockThread类实现Runnalbe接口
class LockThread implements Runnable{
     private int tickets=10; //10张票
     //定义一个Lock锁对象
     private final Lock lock=new ReentrantLock();
     public void run(){
            while(true){
                   lock.lock();   //对代码块进行加锁
                   if(tickets>0){
                       try{
                            Thread.sleep(100);  //模拟售票耗时过程
                            System.out.println(Thread.currentThread().getName()
                            +"正在发售第"+tickets--+"张票");
                       }catch(InterruptedException e){
                            e.printStackTrace();
                       }finally{
                            lock.unlock(); //执行完代码后释放锁
                       }
                   }
            }
     }
}
public class _4同步锁 {
    public static void main(String[] args) {
        LockThread lockThread=new LockThread();
        //创键并开启4个线程,模拟4个售票窗口
        new Thread(lockThread,"窗口1").start();
        new Thread(lockThread,"窗口2").start();
        new Thread(lockThread,"窗口3").start();
        new Thread(lockThread,"窗口4").start();
    }
}
