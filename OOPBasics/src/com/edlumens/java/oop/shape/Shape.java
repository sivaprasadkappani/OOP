package com.edlumens.java.oop.shape;

public abstract class Shape {
    protected String color;

    // Constructor of the abstract class
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate area
    public abstract double calculateArea();

    // Concrete method to get color
    public String getColor() {
        return color;
    }
}