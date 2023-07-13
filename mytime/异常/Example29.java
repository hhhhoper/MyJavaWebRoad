class Example{
   //下面的方法实现了两个整数相除
   public static int divide(int x,int y){
       try{
           int result=x/y;   //定义一个变量result记录两个数相除的结果
           return result;    
       }catch (Exception e){    //对异常进行捕获处理
                   System.out.println("捕获的异常信息为:"+e.getMessage());
       }
       finally{
                   System.out.println("finally代码块，无论程序是否异常都会执行"); //system.exit(0)不执行
       }
       return -1;
   }
   public static void main(String[] args) {
          int result=divide(4, 0);
          if(result==-1){
                   System.out.println("程序异常");
          }
          else{
                   System.out.println(result);
          }
   }
}