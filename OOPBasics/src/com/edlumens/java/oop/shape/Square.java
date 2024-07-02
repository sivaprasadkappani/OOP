package com.edlumens.java.oop.shape;

public class Square extends Shape {
    
    private double sideLength;
    
    public Square(double sideLength, String colour ) {
    	super( colour );
        this.sideLength = sideLength;
    }
    
    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

	@Override
	public String toString() {
		return "Square [sideLength=" + sideLength + ", color=" + color + "]";
	}
    
     
}
