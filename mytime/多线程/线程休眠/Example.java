package 多线程.线程休眠;

public class Example {
   public static void main(String[] args) {
                   //分别定义两个Thread线程对象
   Thread thread1=new Thread(()->{
                   for(int i=0;i<10;i++){
                            System.out.println(Thread.currentThread().getName()
                            +"正在输出i:"+i);
                            if(i==2){
                                      try{
                                          //在线程执行过程中进入休眠状态,让其他线程先执行
                                          Thread.sleep(1000);
                                      }catch(InterruptedException e){
                                          e.printStackTrace();
                                      }
                            }
                   }
                   
   });
   Thread thread2=new Thread(()->{
     for(int j=0;j<10;j++){
                   System.out.println(Thread.currentThread().getName()+
                   "正在输出j:"+j);
     }
   });
   //开启两个线程
      thread1.start();
      thread2.start();
   }
}
