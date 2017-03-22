package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	
	private Point center;
	
	public void draw() {
		System.out.println("Drawing the Circle");
		System.out.println("The center of the circle : (" + this.center.getX() + ", " + this.center.getY() + ")");
	}

	public Point getCenter() {
		return center;
	}
	
	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}
	
}
