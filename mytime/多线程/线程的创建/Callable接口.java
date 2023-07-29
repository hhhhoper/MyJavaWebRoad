 //1.定义一个实现Callable接口的实现类

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class CallableIm implements Callable{
   //重写Callable接口的call()方法
   public Object call()throws Exception{
           int i=0;
           while(i++<5){
                   System.out.println(Thread.currentThread().getName()+"的call()方法在进行");
           }
           return i;
   }
}

public  class Callable接口{
         public static void main(String[] args) throws InterruptedException,ExecutionException{
                   //2.创建Callable接口的实现类对象
                   CallableIm callableIm=new CallableIm();
                   //3.使用FutureTask封装Callable接口
                   FutureTask<Object>ft1=new FutureTask<>(callableIm);
                   //4.使用Thread(Runnable target,String name)构造方法创建线程对象
                   Thread thread1=new Thread(ft1,"thread1");
                   //5.调用线程对象的start()方法启动线程
                   thread1.start();
                   //创建并启动另一个线程thread2
                   FutureTask<Object>ft2=new FutureTask<>(callableIm);
                   Thread thread2=new Thread(ft2,"thread2");
                   thread2.start();
                   System.out.println("thread1返回结果:"+ft1.get());
                   System.out.println("thread2返回结果:"+ft2.get());

         }
}
