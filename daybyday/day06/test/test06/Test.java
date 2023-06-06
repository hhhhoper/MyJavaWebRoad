package test.test06;

public class Test {
      public static void main(String[] args) {
                   Teacher teacher=new Teacher("周老师","30","java面对对象内容"); 
                   teacher.eat();
                   teacher.teach();
                   Student student=new Student("韩同学","18", "java面向对象知识");
                   student.eat();
                   student.study();

      }            
}
