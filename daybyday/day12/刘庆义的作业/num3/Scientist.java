package day12.作业.num3;

public class Scientist extends Worker{
                   double bonus;
                   public Scientist(double bsSalary,double bouns) {
                               this.bsSalary = bsSalary;
                               this.bonus=bonus;
                               printSalary();
                               
            }
            public void printSalary(){
                           double salary=bsSalary+bonus;    
                           System.out.println("工资："+salary);
            }
                            
}
