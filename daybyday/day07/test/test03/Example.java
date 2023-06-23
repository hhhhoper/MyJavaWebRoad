package test.test03;

public class Example {
    public static void main(String[] args) {
        Duck duck=new Duck("鸭子","发烧",2,"感冒");
        duck.showMsg();
        System.out.println("入院原因:"+duck.illness);
        System.out.println("症状为:"+duck.symptom);
    }
}
