package test07;

public class Test07 {
    public static void main(String[] args) {
         round(1.4);
         round(1.9);
    }
    public static int round(double num){
             double value=num+0.5;
             System.out.println(num+"->"+(int)value);  
              return (int)value;
    }               
}
