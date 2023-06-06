public class Test {
    public static void main(String[] args) {
        System.out.println(abs(-19));
    }        
    public static int abs(int num){
                   if(num<0){
                     num=-num;
                   } 
                   return num;
                 }
    public static double abs(double num){
                      if(num<0){
                        num=-num;
                      }
                      return num;
                    }   
}
