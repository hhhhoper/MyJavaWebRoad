package 练习.num2;

public class GradeConverter {
                   private double percentage;

                   public GradeConverter(double percentage) {
                       this.percentage = percentage;
                   }
               
                   public void setPercentage(double percentage) {
                       this.percentage = percentage;
                   }
               
                   public double getPercentage() {
                       return percentage;
                   }
               
                   public String getFiveGrade() {
                       if (percentage >= 90) {
                           return "优秀";
                       } else if (percentage >= 80) {
                           return "良好";
                       } else if (percentage >= 70) {
                           return "中等";
                       } else if (percentage >= 60) {
                           return "及格";
                       } else {
                           return "不及格";
                       }
                   }
}
