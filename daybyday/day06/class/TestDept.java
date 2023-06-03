public class TestDept {
   public static void main(String[] args) {
       //创建部门对象
       Dept dept1=new Dept("技术部", 20);
       System.out.println(dept1.getDname());
       Dept dept2=new Dept("测试部",30,"CHICAGO");
       System.out.println(dept2.getDname());
       //测试返回当前对象引用
       Dept dept3=new Dept().clone();
       dept3.setDname("运维部");
       System.out.println(dept3.getDname());
       Dept dept4=Dept.clone1();
       dept4.setDname("销售部");
       System.out.println(dept4.getDname());
   }
}
