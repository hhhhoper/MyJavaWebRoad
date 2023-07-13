package throwsa;

public class Example31 {
    //下面的方法实现了两个整数相除，并使用throws关键字声明抛出异常
    public static int divide(int x,int y)throws Exception{
                   int result=x/y;    //定义变量result记录两个数相除的结果
                   return result;     //将结果返回
    }
    public static void main(String[] args) {
                   int result;
                   try {
                                      result = divide(4, 0);
                                      System.out.println(result);
                   } catch (Exception e) {
                                     System.out.println("捕获的异常信息为:"+e.getMessage());
                   } //调用divide方法,
                  
    }
}
