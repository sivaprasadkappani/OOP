package com.edlumens.java.oop.shape;

public class ShapeAreaCalculator {
	
	 // Method to calculate total area of shapes
    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        
        // Iterate through the array and sum up the areas
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            System.out.println("Shape: " + shape.getColor() + ", Area: " + shape.calculateArea());
        }
        
        return totalArea;
    }
}
