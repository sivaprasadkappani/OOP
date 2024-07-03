package com.edlumens.java.oop.relation.hasa;

//Wheel.java
public class Wheel {
 private String brand;
 private double diameter;

 public Wheel(String brand, double diameter) {
     this.brand = brand;
     this.diameter = diameter;
 }

 public void rotate() {
     System.out.println("Wheel is rotating...");
 }

 // Getters and setters (omitted for brevity)
}
