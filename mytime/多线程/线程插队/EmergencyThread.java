package 多线程.线程插队;

class EmergencyThread implements Runnable{
     public void run(){
          for(int i=0;i<6;i++){
               System.out.println(Thread.currentThread().getName()
               +"输入:"+i);
          }
     }
}
class Example{
       public static void main(String[] args) throws InterruptedException {
              //创建线程
              Thread thread1=new Thread(new EmergencyThread(),"thread1");
              thread1.start();   //开启线程
              for(int i=1;i<6;i++){
                   System.out.println(Thread.currentThread().getName()+"输入:"+i);
                   if(i==2){
                                      thread1.join();  //调用join()方法
                                 }
              }
              
       }
}

