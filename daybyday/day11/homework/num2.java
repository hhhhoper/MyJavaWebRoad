package day11.homework;

class Vehicle{
        private String band;
        String color;
        double speed;
public Vehicle(){}
public Vehicle(String band, String color) {
                   this.band = band;
                   this.color = color;
}
public String getBand() {
                   return band;
}
public String getColor() {
                   return color;
}
public double getSpeed() {
                   return speed;
}
public void run(){
                   System.out.println("汽车跑");
}
}
class Car extends Vehicle{
     private int loader;
     public Car(){}
public Car(String band, String color, int loader) {
                   super(band, color);
                   this.loader = loader;
}
     
}
public class num2 {
               public static void main(String[] args) {
                   Vehicle vehicle=new Vehicle("benz", "black");
                   Car car=new Car("Honda", "red", 2);
               }    
}
