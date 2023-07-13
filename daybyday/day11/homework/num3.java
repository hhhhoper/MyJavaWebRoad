package day11.homework;

public class num3 {
               public static void main(String[] args) {
                   Rectangle rectangle=new Rectangle(2, 4, "白色");
                   rectangle.getArea();
                   rectangle.showAll();
                   Circle circle=new Circle(2, "蓝");
                   circle.showAll();
               }    
}

abstract class Shape{
      double area;
      double per;
      String color;

public Shape(){}
public Shape(String color) {
                   this.color=color;
}
abstract double getArea();
abstract double getPer();
public void showAll(){
                   System.out.println("颜色:"+this.color+"\n面积:"+this.area+"\n+周长:"+per);
     }
}

class Rectangle extends Shape{
     double width;
     double heigth;
     public Rectangle(){}
     public Rectangle(double width,double heigth,String color){
                   this.heigth=heigth;
                   this.width=width;
                   this.color=color;
                   
}
     public double getArea(){
              double area=width*heigth;
              this.area=area;
              return  area;
     }
     public double getPer(){
                   double per=2*(width+heigth);
                   this.per=per;
                   return  per;
     }
     
     public String getColor(){
                   return color;
     }
}

class Circle extends Shape{
                   double r;
                   public Circle(){     
                   }
                   public Circle(double r,String color){
                                 this.r=r;
                                 this.color=color;
                                 getArea();
                                 getPer();
              }
                   public double getArea(){
                            double area=Math.PI*r*r;
                            this.area=area;
                            return  area;
                   }
                   public double getPer(){
                                 double per=2*Math.PI*2*r;
                                 this.per=per;
                                 return  per;
                   }
                   
                   public String getColor(){
                                 return color;
                   }
              }
              