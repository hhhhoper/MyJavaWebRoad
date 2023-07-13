package test.test07;

public class Cat {
    int age;
    char color;
    public Cat(){}
    public Cat(int age,char color){
        this.age=age;
        this.color=color;
    }
public int getAge() {
                   return age;
}
public char getColor() {
                   return color;
}
public void setAge(int age) {
                   this.age = age;
}
public void setColor(char color) {
                   this.color = color;
}      
public void showMsg(){
     System.out.println("猫的年龄:"+age+",颜色:"+color);

}
}
