package test10;

public class Test10 {
      public static void main(String[] args) {
            futureIncome(20);       
      }
      public static void futureIncome(int years){
        double part=1.1;
        for(int i=0;i<years-1;i++){
            part=part*1.1;
        }
        double money=10000*(part-1)/0.1;
        System.out.println("第1年末10000");
        System.out.println("第"+years+"年末"+(int)money);
      }
}
