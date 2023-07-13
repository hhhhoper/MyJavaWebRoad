package day12.作业.num2;

public class Professor extends Teacher{
      public Professor(String name,int age,String post){
                   this.name=name;
                   this.age=age;
                   this.salary=1.3;
                   this.post=post;
      }  
      public void introduce(){
                   System.out.println("姓名:"+name+"\n年龄:"+age+"\n工资:"+salary+"\n职称:"+post);

      }
}
