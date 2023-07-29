class MyThread extends Thread{
        //创建子线程有参构造方法
        public MyThread(String name){
                super(name);
    }
    //重写Thread类的run()方法
    public void run(){
         int i=0;
         while(i++<5){
               System.out.println(Thread.currentThread().getName());
         }
    }
    public static void main(String[] args) {
           //创建Thread类实例对象
           MyThread myThread1=new MyThread("thread1");
           //调用start()方法启动线程
           myThread1.start();
           //创建Thread类实例对象
           MyThread myThread2=new MyThread("thread2");
           myThread2.start();
    }
}