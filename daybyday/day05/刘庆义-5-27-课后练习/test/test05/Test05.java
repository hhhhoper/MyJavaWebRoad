package test05;

public class Test05 {
   public static void main(String[] args) {
      getValue(5, 12, 22, "");
}
   public static int getValue(int num1,int num2,int num3,String m){
       int value;            
       if(m=="max"){
             value = num1 > (num2 > num3 ? num2 : num3) ? num1 : (num2 > num3 ? num2 : num3);
             System.out.println("最大值为:"+value);
       }else{
             value= num1<(num2<num3?num2:num3)?num1:(num2<num3?num2:num3);
             System.out.println("最小值为:"+value);
       }

       return value;
   }
}
