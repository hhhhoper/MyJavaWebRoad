package test.test04;

public abstract class Person {
    String name;
    int age;
    public Person(){    
    }
    public Person(String name,int age){
         this.name=name;
         this.age=age;
    }
    public abstract void showMsg();
public String getName() {
                   return name;
}
public int getAge() {
                   return age;
}
public void setName(String name) {
                   this.name = name;
}
public void setAge(int age) {
                   this.age = age;
}
    
}
