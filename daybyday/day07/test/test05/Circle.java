package test.test05;

public class Circle extends Shape{
    double r;
    public Circle(double r){
        this.r=r;
    }
    final double PI=3.14;
    public double perimeter(){
        System.out.println("圆形周长:"+2*PI*2*r);
        return 2*PI*2*r;
    }
    public double area(){
        System.out.println("圆形面积:"+PI*r*r);
        return PI*r*r;
    }
}
