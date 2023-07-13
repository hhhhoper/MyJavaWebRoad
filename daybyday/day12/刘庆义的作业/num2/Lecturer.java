package day12.作业.num2;

public class Lecturer extends Teacher {
                   public Lecturer(String name,int age,String post){
                                      this.name=name;
                                      this.age=age;
                                      this.salary=1.1;
                                      this.post=post;
                         }  
                         public void introduce(){
                                      System.out.println("姓名:"+name+"\n年龄:"+age+"\n工资:"+salary+"\n职称:"+post);
                   
                         }
                   
}
