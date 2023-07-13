package test.test06;

public class Clerk extends Employee {
        String manager;
        public Clerk(String name,String department,String id,String manager){
             this.name=name;
             this.department=department;
             this.manager=manager;
             this.id=id;
        }
        public void print(){
             System.out.println(department+"的："+name+",员工编号:"+id+"\n他的经理是"+manager);
        }
           
}
