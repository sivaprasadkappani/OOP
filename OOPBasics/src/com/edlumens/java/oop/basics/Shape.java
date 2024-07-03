package com.edlumens.java.oop.basics;

//Shape.java
public interface Shape {
 
 // Abstract method (implicitly public and abstract)
 double calculateArea();
 
 // Default method (with a body)
 default void display() {
     System.out.println("Displaying shape...");
 }
 
 
 
 // Static method (available starting from Java 8)
 static void printMessage() {
     System.out.println("This is a Shape interface");
 }
 
 
}
