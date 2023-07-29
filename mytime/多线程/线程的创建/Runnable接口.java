class Test implements Runnable{
        //重写Runable接口的run()方法
        public void run(){
              int i=0;
              while(i++<5){
                   System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
              }
        }
    
}
class Main{
       public static void main(String[] args) {
                   //创建Runnable接口实现类的实例对象
                   Test test=new Test();
                   //使用Thread(Runnable target,String name)构造方法创建线程对象
                   Thread thread1=new Thread(test,"thread1");
                   //4调用线程对象的start方法启动线程
                   thread1.start();
                   //创建并启动一个线程thread2
                   Thread thread2=new Thread(test,"thread2");
                   thread2.start();

       }
}