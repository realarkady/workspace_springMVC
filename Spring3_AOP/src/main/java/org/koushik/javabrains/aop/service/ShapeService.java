package org.koushik.javabrains.aop.service;

import org.koushik.javabrains.aop.aspect.Loggable;
import org.koushik.javabrains.aop.model.Circle;
import org.koushik.javabrains.aop.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	
	public ShapeService() {	}
	
	@Loggable
	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
}
