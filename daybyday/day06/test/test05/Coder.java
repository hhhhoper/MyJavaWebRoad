package test.test05;

public class Coder {
    String name;
    int jobnum;
    int salary;
    public Coder(){}
    public Coder(String name,
    int jobnum,int salary){
        this.name=name;
        this.jobnum=jobnum;
        this.salary=salary;
    }
public String getName() {
    return name;
}
public int getJobnumber() {
    return jobnum;
}
public int getSalary() {
    return salary;
}
public void setName(String name) {
    this.name = name;
}
public void setJobnumber(int jobnumber) {
    this.jobnum = jobnumber;
}
public void setSalary(int salary) {
    this.salary = salary;
}
public void intro(){
    System.out.println("姓名:"+name+"\n"+"工号:\n"+jobnum+"基本工资为:"+salary+"，奖金无\n正在努力写代码......");
}
    
    
}
