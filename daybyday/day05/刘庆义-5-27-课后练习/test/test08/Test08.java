package test08;

public class Test08 {
    public static void main(String[] args) {
        transform(30.0);
    }     
    public static void transform(double num){
         double value=(9.0/5)*num+32;
         System.out.println("摄氏度为:"+num+"°--华氏度为:"+value);
         System.out.println("华氏度为:"+value+"°--摄氏度为:"+num);
    }
}
