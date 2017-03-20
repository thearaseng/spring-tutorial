package com.spring;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
	
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw(){
		for(Point point : this.points){
			System.out.println("Point : (" + point.getX() + ", " + point.getY() + ")");
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method for Triangle");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory method for Traingle");
	}
	
	public void myInit() {
		System.out.println("My Initializing method for Triangle");
	}
	
	public void cleanUp() {
		System.out.println("My cleanUp method for Traingle");
	}
}
