package com.edlumens.java.oop.shape;

public class CircleUser {
	public static void main(String[] args) {
        Circle circle1 = new Circle( 5.0, "Red");
        System.out.println( "circle1 : " + circle1 );
        System.out.println("Color: " + circle1.getColor());
        System.out.println("Area: " + circle1.calculateArea());
        
        
        Circle circle2 = new Circle( 8.06, "Blue");
        System.out.println( "circle2 : " + circle2 );
        System.out.println("Color: " + circle2.getColor());
        System.out.println("Area: " + circle2.calculateArea());
    }
}
