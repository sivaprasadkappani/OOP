package com.edlumens.java.oop.shape;

public class Rectangle extends Shape {
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
    	super( "Red" );
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(double length, double width, String color ) {
    	super( color );
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
     
}
