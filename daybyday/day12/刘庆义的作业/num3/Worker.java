package day12.作业.num3;

public class Worker {
     double bsSalary;

public Worker() {
}

public Worker(double bsSalary) {
                   this.bsSalary = bsSalary;
                   printSalary();
                   
}
public void printSalary(){
               System.out.println("工资："+bsSalary);
}
     
}
