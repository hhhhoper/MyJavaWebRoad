package 练习.num5;

public class Test {
                   public static void main(String[] args) {
                                      // 创建子类对象
                                      ComputerScienceStudent csStudent = new ComputerScienceStudent("Alice", "Computer Science", 85.5, "Algorithms");
                                      SoftwareStudent swStudent = new SoftwareStudent("Bob", "Software Engineering", 92.0, "Software Development");
                              
                                      // 打印对应的信息
                                      System.out.println("计科学生信息：");
                                      System.out.println("姓名：" + csStudent.getName());
                                      System.out.println("专业：" + csStudent.getMajor());
                                      System.out.println("成绩：" + csStudent.getScore());
                                      System.out.println("独有学科：" + csStudent.getSubject());
                              
                                      System.out.println();
                              
                                      System.out.println("软件学生信息：");
                                      System.out.println("姓名：" + swStudent.getName());
                                      System.out.println("专业：" + swStudent.getMajor());
                                      System.out.println("成绩：" + swStudent.getScore());
                                      System.out.println("独有学科：" + swStudent.getSubject());
                                  }
}
