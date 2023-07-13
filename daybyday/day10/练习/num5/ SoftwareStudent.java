package 练习.num5;

class SoftwareStudent extends Student {
                   // 属性：独有学科
                   private String subject;
               
                   // 构造方法
                   public SoftwareStudent(String name, String major, double score, String subject) {
                       super(name, major, score);
                       this.subject = subject;
                   }
               
                   // Getter方法
                   public String getSubject() {
                       return subject;
                   }
               }