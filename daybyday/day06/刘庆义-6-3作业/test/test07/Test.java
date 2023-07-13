package test.test07;

public class Test {
    public static void main(String[] args) {
        Cat cat1=new Cat(5, '黑');
        cat1.showMsg();
        Cat cat2=new Cat(5,'白');
        cat2.showMsg();
        sameAtt(cat1, cat2);
        Cat cat3=new Cat(3, '黄');
        cat3.showMsg();
        Cat cat4=new Cat(3,'黄');
        cat4.showMsg();
        sameAtt(cat3, cat4);
    }     
    public static boolean sameAtt(Cat cat1,Cat cat2){
        boolean same=false;
        if(cat1.age==cat2.age&&cat1.color==cat2.color){
            same=true;       
        }
        System.out.println("属性是否相同?"+same);
        return true;
    }
}
