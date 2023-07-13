package day12.作业.num3;

public class Teacher extends Worker{
       double exsalary;
       public Teacher(double bsSalary,double exsalary) {
                   this.bsSalary = bsSalary;
                   this.exsalary=exsalary;
                   super.printSalary();
}
public void printSalary(){
               double salary=bsSalary+exsalary;    
               System.out.println("工资："+salary);
}
     
}
