package com.edlumens.java.oop.shape;

class Circle extends Shape {
    private double radius;

    public Circle( double radius, String color) {
        super(color); // Calling constructor of abstract class
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

	@Override
	public String toString() {
		return "Circle [radius=" + radius +  " Color=" + color + "]";
	}
    
    
}