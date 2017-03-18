package org.panwar.springAop.service;

import org.panwar.springAop.model.Circle;
import org.panwar.springAop.model.Triangle;

public class ShapeService {

	private Triangle triangle;
	private Circle circle;
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
}
