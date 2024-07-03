package com.edlumens.java.oop.relation.isa;

//Main.java
public class Main {
 public static void main(String[] args) {
     Car myCar = new Car("Toyota", 2022, 4);
     Bike myBike = new Bike("Honda", 2021, true);

     // Demonstrating is-a relationship
     System.out.println("My Car:");
     myCar.displayInfo();
     myCar.start();
     myCar.stop();

     System.out.println("\nMy Bike:");
     myBike.displayInfo();
     myBike.start();
     myBike.stop();
 }
}
