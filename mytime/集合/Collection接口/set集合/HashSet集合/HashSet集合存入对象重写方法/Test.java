package Collection接口.set集合.HashSet集合.HashSet集合存入对象重写方法;
import java.util.HashSet;
class Student {
    String id;
    String name;
    public int hashCode(){
        return id.hashCode();
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;    //判断是否是同一个对象
        }
        if(!(obj instanceof Student)){   //判断对象是否为Student类型
             return false;
        }
        Student stu=(Student)obj;  //将对象强转为Student类型
        boolean b=this.id.equals(stu.id); //判断id值是否相同
        return b;   //返回判断结果
    }
    public Student(String id,String name){
                   this.id=id;
                   this.name=name;
    }
    public String toString(){
                   return id+":"+name;
    }
}

public class Test{
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        Student stu1=new Student("1", "Jack");
        Student stu2=new Student("2","Rose");
        Student stu3=new Student("2", "Rose");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
                   
}
