package test.test04;

public class Example {
   public static void main(String[] args) {
       Teacher tea=new Teacher("张老师", 30, "Java课");
       tea.showMsg();
       Student stu=new Student(90,"乐乐");
       stu.showMsg();
   }
}
