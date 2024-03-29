package 多线程.线程优先级;

public class Example {
    public static void main(String[] args) {
          //分别创建两个Thread线程对象
          Thread thread1=new Thread(()->{for(int i=0;i<10;i++){
                   System.out.println(Thread.currentThread().getName()+"正在输出i:"+i);
          }},"优先级较低的线程");
          Thread thread2=new Thread(()->{for(int i=0;i<10;i++){
                   System.out.println(Thread.currentThread().getName()+"正在输出i:"+i);
          }},"优先级较高的线程");
          //分别设置线程的优先级
          thread1.setPriority(Thread.MIN_PRIORITY);
          thread2.setPriority(10);
          //开启两个线程
          thread1.start();
          thread2.start();
    }
}
