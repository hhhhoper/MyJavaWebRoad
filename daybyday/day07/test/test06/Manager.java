package test.test06;

public class Manager extends Employee{
    String employee;
    public Manager(String name,String department,String id,String employee){
        this.name=name;
        this.department=department;
        this.id=id;
        this.employee=employee;
    }
    public void print(){
        System.out.println(department+"的："+name+",员工编号:"+id+"\n他的员工是"+employee);
   }
}
