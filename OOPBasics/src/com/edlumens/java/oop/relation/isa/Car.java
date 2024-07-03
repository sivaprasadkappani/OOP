package com.edlumens.java.oop.relation.isa;

//Car.java
public class Car extends Vehicle {
 private int numberOfDoors;

 public Car(String brand, int year, int numberOfDoors) {
     super(brand, year);  // Call superclass constructor
     this.numberOfDoors = numberOfDoors;
 }

 public void displayInfo() {
     super.displayInfo();  // Call superclass method
     System.out.println("Type: Car, Number of doors: " + numberOfDoors);
 }

 public void start() {
     System.out.println("Car starting...");
 }

 public void stop() {
     System.out.println("Car stopping...");
 }
}
