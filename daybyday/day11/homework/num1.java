package day11.homework;
class Player{
    static int sum;
    public static Player create(){
                   if(sum<11){
                         System.out.println("创建了一个队员");             
                         sum+=1;     
                         return new Player();
                   }
                   System.out.println("已经创建11个了不能再创建了");
                   return null;
                   
    }
}

public class num1{
                 public static void main(String[] args) {
                   for(int i=0;i<=11;i++){
                        Player player=Player.create();
                   }
                 }
}