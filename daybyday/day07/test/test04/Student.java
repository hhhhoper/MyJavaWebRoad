package test.test04;

public class Student extends Person {
   String name;
   int num;
   public Student(){}
   public Student(int num,String name){
       this.name=name;
       this.num=num;
   }
   public void showMsg(){
       System.out.println(name+"同学,考试得了:"+num+"分");
   }
}
