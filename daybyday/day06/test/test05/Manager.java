package test.test05;

public class Manager {
                   String name;
                   String jobnum;
                   int bsalary;
                   int salary;
                   int bonus;

                   public void setName(String name) {
                                      this.name = name;
                   }

                   public void setJobnum(String jobnum) {
                                      this.jobnum = jobnum;
                   }

                   public void setBsalary(int bsalary) {
                                      this.bsalary = bsalary;
                   }

                   public void setBonus(int bonus) {
                                      this.bonus = bonus;
                   }

                   public String getName() {
                                      return name;
                   }

                   public String getJobnum() {
                                      return jobnum;
                   }

                   public int getBsalary() {
                                      return bsalary;
                   }

                   public int getBonus() {
                                      return bonus;
                   }

                   public Manager() {
                   }

                   public Manager(String name, String jobnum, int salary, int bonus) {
                                      this.name = name;
                                      this.jobnum = jobnum;
                                      this.salary = salary;
                                      this.bonus=bonus;
                   }

                   public int getSalary() {
                                      return salary;
                   }
                   public void showSalary(){
                                      System.out.println("经理姓名:"+name+"工号:"+jobnum+"基本工资为"+bsalary+",奖金为"+bonus+"正在努力的坐着管理工作，分配任务，检查员工提交上来的代码.....");
                   }
}
