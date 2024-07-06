package com.edlumens.java.oop.shape;

public class ShapeCalculatorTest {
	public static void main(String[] args) {
        // Create an array of Shape objects including Square
        Shape[] shapes = new Shape[4];
        
        //shapes[0] = new Rectangle(5, 3);
        shapes[1] = new Circle(4, "Green" );
        shapes[2] = new RightAngledTriangle(6, 2, "Blue" );
        shapes[3] = new Square(4, "White" );
        
        // Calculate total area using polymorphism
        ShapeAreaCalculator areaCalculator = new ShapeAreaCalculator();
        double totalArea = areaCalculator.calculateTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);
    }
}
