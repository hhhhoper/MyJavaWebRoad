package test.test06;

public class Teacher {
    String name;
    String age;
    String content;
    public Teacher(){}
    public Teacher(String name,String age,String content){
                   this.age=age;
                   this.name=name;
                   this.content=content;
    }
    public void eat(){
                   System.out.println("年龄为"+age+"的"+name+"正在吃饭....");
    }
    public void teach(){
                   System.out.println("年龄为"+age+"的"+name+"正在亢奋的讲着"+content+"....");
    }   
}
