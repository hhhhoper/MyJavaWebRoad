

public class Dept {
    //部门名称
    String dname;
    //部门编号
    int deptno;
    //部门所在地
    String loc;
    public Dept(){}
    public Dept(String dname){
        this.dname=dname;
}
    public Dept(String dname,int deptno){
        this(dname);
        this.deptno=deptno;
    }
    //三个参数的构造器 引用2个参数重载构造器
    public Dept(String dname,int deptno,String loc){
        this(dname,deptno);
        this.loc=loc;
    }
    //返回当前对象的引用
    public Dept clone(){
        return this;
    }
    public static Dept clone1(){
        return new Dept();
    }
    //定义setter方法给属性进行赋值
    public void setDname(String dname){
        this.dname=dname;
    }
    //定义getter方法取属性值
    public String getDname(){
         return dname;
    }
    
}
