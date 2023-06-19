public class Animal {
    private String name;
    private int age;
    private String sex;
    public Animal(){}
    public Animal(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public void eat(){
        System.out.println("动物都会吃食");
    }
    public void sleep(){
        System.out.println("动物都要睡觉");
    }
public void setName(String name) {
                   this.name = name;
}
public void setAge(int age) {
                   this.age = age;
}
public void setSex(String sex) {
                   this.sex = sex;
}
public String getName() {
                   return name;
}
public int getAge() {
                   return age;
}
public String getSex() {
                   return sex;
}
    
}
