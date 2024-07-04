package com.edlumens.java.oop.shape;

import java.util.Objects;

public class Rectangle extends Shape {

	private double length;
	private double width;

	@Override
	public double calculateArea() {
		return length * width;
	}

	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(length, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}
	
	

}