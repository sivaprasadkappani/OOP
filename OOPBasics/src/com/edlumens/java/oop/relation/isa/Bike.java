package com.edlumens.java.oop.relation.isa;

//Bike.java
public class Bike extends Vehicle {
 private boolean hasGear;

 public Bike(String brand, int year, boolean hasGear) {
     super(brand, year);  // Call superclass constructor
     this.hasGear = hasGear;
 }

 public void displayInfo() {
     super.displayInfo();  // Call superclass method
     System.out.println("Type: Bike, Has gears: " + hasGear);
 }

 public void start() {
     System.out.println("Bike starting...");
 }

 public void stop() {
     System.out.println("Bike stopping...");
 }
}
