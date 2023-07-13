package Class.test2;

public class Student extends Person implements Consumer{
     public Student(String name,int age,String sex){
                   this.name=name;
                   this.age=age;
                   this.sex=sex;
     }    
     public void useCreate(){
                   System.out.println("useCreate");
     }

}
