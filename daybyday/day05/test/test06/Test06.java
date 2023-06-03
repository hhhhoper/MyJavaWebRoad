package test06;

public class Test06 {
    public static void main(String[] args) {
        printX(100000000);
    }
    public static void printX(int num){
      String row="";
      for(int i=0;i<num;i++){
         for(int j=0;j<10;j++){
            if(j==i%10){
               row=row+"O";
            }
            else if(j==10-i%10-1){
               row=row+"O";    
            }
            else{
               row=row+"*";    
            }
               System.out.print(row);
               row="";
            }
            System.out.println("\n");
         }
      }

    }

