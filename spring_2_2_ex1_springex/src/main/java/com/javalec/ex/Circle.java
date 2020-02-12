package com.javalec.ex;

public class Circle {

	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getCircle() {
		return Math.PI * radius  * radius;
	}
}
