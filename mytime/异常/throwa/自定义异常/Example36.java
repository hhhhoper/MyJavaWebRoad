package throwa.自定义异常;

public class Example36 {
    //下面的方法实现了两个整数相除
    public static int divide(int x,int y)throws DivideByMinusException
    {
        if(y==0){                                                                                                                                                                                                    
            //使用自定义异常类
            throw new  DivideByMinusException("不能除0");
        }
        System.out.println("resault:"+x/y);
        return x/y;
    }
    public static void main(String[] args)  {
        try{
            divide(1, 0);
        }
        catch(DivideByMinusException divideByMinusException){
            System.out.println(divideByMinusException.getMessage());
        }

        
    }
}
