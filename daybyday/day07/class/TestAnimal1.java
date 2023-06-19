public class TestAnimal1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.setName("旺财");
        d.setAge(2);
        d.setSex("雌");
        System.out.println(d.getName()+","+d.getAge()+","+d.getSex());
        d.eat();
        d.sleep();
        System.out.println('a',+1+3+'0');
    }       
}
