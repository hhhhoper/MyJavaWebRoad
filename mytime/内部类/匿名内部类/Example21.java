package 匿名内部类;
interface Animal{
   void shout();
}
class Example21{
   public static void main(String[] args) {
       String name="小花";
       //定义匿名内部类作为参数传递给animalShout()方法
       //实现shout()方法
       animalShout(new Animal() {
                    public void shout(){
                                      System.out.println(name+"喵喵");
                    }
       });
   }
   public static void animalShout(Animal an){
         an.shout();
   }
}