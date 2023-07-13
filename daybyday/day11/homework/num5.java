package day11.homework;

import java.util.Scanner;

interface Fruit {
                   void printInfo();
               }
               class Apple implements Fruit {
                   public Apple() {
                       System.out.println("I am an apple.");
                   }
               
                   @Override
                   public void printInfo() {
                       System.out.println("This is an apple.");
                   }
               }
               
               class Banana implements Fruit {
                   public Banana() {
                       System.out.println("I am a banana.");
                   }
               
                   @Override
                   public void printInfo() {
                       System.out.println("This is a banana.");
                   }
               }
               
               class Grape implements Fruit {
                   public Grape() {
                       System.out.println("I am a grape.");
                   }
               
                   @Override
                   public void printInfo() {
                       System.out.println("This is a grape.");
                   }
               }
               
               class Gardener {
                   public static Fruit createFruit(String fruitType) {
                       if (fruitType.equalsIgnoreCase("apple")) {
                           return new Apple();
                       } else if (fruitType.equalsIgnoreCase("banana")) {
                           return new Banana();
                       } else if (fruitType.equalsIgnoreCase("grape")) {
                           return new Grape();
                       } else {
                           return null;
                       }
                   }
               }
public class num5{
                   public static void main(String[] args) {
                                      Scanner scanner = new Scanner(System.in);
                                      System.out.print("Enter a fruit type (apple, banana, grape): ");
                                      String fruitType = scanner.nextLine();
                              
                                      Fruit fruit = Gardener.createFruit(fruitType);
                                      
                                      if (fruit != null) {
                                          fruit.printInfo();
                                      } else {
                                          System.out.println("Invalid fruit type.");
                                      }
                                  }
}