package test.test06;

public class Student {
                   String name;
                   String age;
                   String content;

                   public Student() {
                   }

                   public Student(String name, String age, String content) {
                                      this.name = name;
                                      this.age = age;
                                      this.content = content;
                   }

                   public void eat() {
                                      System.out.println("年龄为" + age + "的" + name + "正在吃饭....");
                   }

                   public void study() {
                                      System.out.println("年龄为" + age + "的" + name + "正在专心致志的听着" + content + ".....");
                   }

                   public void setName(String name) {
                                      this.name = name;
                   }

                   public void setAge(String age) {
                                      this.age = age;
                   }

                   public void setContent(String content) {
                                      this.content = content;
                   }

                   public String getName() {
                                      return name;
                   }

                   public String getAge() {
                                      return age;
                   }

                   public String getContent() {
                                      return content;
                   }
}
