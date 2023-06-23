package test.test04;

public class Teacher extends Person{
    String major;
    public Teacher(){}
    public Teacher(String name,int age,String major){
        this.age=age;
        this.name=name;
        this.major=major;
    }
    public void showMsg(){
        System.out.println(name+"老师,讲授"+major+"课");
    }

    
                   
}
