package com.edlumens.java.oop.basics;

public class CircleUser {
	public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        
        // Calling interface method
        double area = circle.calculateArea();
        System.out.println("Circle Area: " + area);
        
        // Calling default method
        circle.display();
        
        // Calling static method
        Shape.printMessage();
    }
}
