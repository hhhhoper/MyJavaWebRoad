package Lamda入门.函数式接口;
//定义无参、无返回值的函数式接口
@FunctionalInterface 
interface Animal{
    void shout();
}
//定义有参、有返回值的函数式接口
interface Caculate{
   int sum(int a,int b);
}
class Example23{
     public static void main(String[] args) {
         //分别两个函数式接口进行测试
         animalShout(()->System.out.println("无参、无返回值的函数式接口调用"));
         showSum(10, 20, (x,y)->x+y);

     }
     private static void animalShout(Animal an){
                   an.shout();
     } 
     private static void showSum(int x,int y,Caculate caculate){
                   System.out.println(x+"+"+y+"的和为:"+caculate.sum(x, y));
     }
}