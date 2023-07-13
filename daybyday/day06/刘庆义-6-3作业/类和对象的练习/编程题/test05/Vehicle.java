package 类和对象的练习.编程题.test05;

public class Vehicle {
                   private String brand;
                   private String color;
                   private double speed = 0;

                   public Vehicle(String color, String brand) {
                                      this.color = color;
                                      this.brand = brand;
                   }
                   public void run(){
                       System.out.println(color+brand+"汽车在跑");
                   }
                   public String getBrand() {
                                      return brand;
                   }

                   public String getColor() {
                                      return color;
                   }

                   public double getSpeed() {
                                      return speed;
                   }

                   public void setColor(String color) {
                                      this.color = color;
                   }

                   public void setSpeed(double speed) {
                                      this.speed = speed;
                   }
                   
}
