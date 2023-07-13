package test.test05;

public class Rectangle extends Shape{
      double length;
      double width;
      public Rectangle(double length,double width){
             this.length=length;
             this.width=width;
      }
      public double perimeter(){
             System.out.println("长方形周长:"+2*(length+width));
             return 2*(length+width);
      }
      public double area(){
             System.out.println("长方形面积:"+length*width);
             return length*width;
      }
}
