package com.edlumens.java.oop.basics;

//Circle.java
public class Circle implements Shape {
 
 private double radius;
 
 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }
 
 // Implementing the abstract method from Shape interface
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
 
 // Optional: Override default method from Shape interface
 @Override
 public void display() {
     System.out.println("Displaying Circle...");
 }
}
