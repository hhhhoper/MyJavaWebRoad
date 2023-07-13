package Class;

public abstract class Animal {
    //父类中都写什么？
    private String name;
    private int age;
    private String color;
@Override
public String toString(){
    return "Animal[name=]"+name+",age="+age+",color="+color+"]";
}
public abstract void eat();
public String getName() {
                   return name;
}
public int getAge() {
                   return age;
}
public String getColor() {
                   return color;
}
public void setName(String name) {
                   this.name = name;
}
public void setAge(int age) {
                   this.age = age;
}
public void setColor(String color) {
                   this.color = color;
}

    
}
