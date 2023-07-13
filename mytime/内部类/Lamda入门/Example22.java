package Lamda入门;
//定义动物类接口
interface Animal{
    void shout();//定义方法shout()
}
public class Example22 {
    public static void main(String[] args) {
                   String name="小花";
                   //1.匿名内部类作为参数传递给animalShout()方法
                   animalShout(new Animal() {
                                      public void shout(){
                                          System.out.println("匿名内部类输出:"+name+"喵喵...");
                                      }
                   });
                   //2.使用Lambad表达式作为参数传递给animalShout()方法
                   animalShout(()->System.out.println("Lambada表达式输出:"+name+"喵喵..."));
    }
    public static void animalShout(Animal an){
                   an.shout();
    }
}
