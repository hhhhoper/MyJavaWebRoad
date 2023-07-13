package nu1;

public class Rectangle implements Shape{
    double longth;
    double width;
    public Rectangle(double longth,double width){
            this.longth=longth;
            this.width=width;
    }
    public double calculateArea(){
                   return longth*width;
    }
}
