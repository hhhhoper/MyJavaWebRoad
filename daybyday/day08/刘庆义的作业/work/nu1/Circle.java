package nu1;

public class Circle implements Shape{
      double r;
      public Circle(double r){
           this.r=r;
      }
      public double calculateArea(){
              return Math.PI*r*r;
      }
}
