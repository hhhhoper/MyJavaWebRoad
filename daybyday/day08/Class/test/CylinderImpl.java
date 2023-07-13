package Class.test;

public class CylinderImpl implements Icylinder{
           double r;
           double h;
           public CylinderImpl(double r,double h){
                    this.r=r;
                    this.h=h;
           }
           public double area(){
                   return 2*PI*r+2*PI*r*r;
           }
           public double volume(){
                   return 2*r*h;
           } 
}
