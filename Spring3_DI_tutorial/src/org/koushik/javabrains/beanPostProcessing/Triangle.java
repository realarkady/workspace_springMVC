package org.koushik.javabrains.beanPostProcessing;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle() {	}
	
	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		if(pointA != null)
			System.out.println("pointA("+pointA.getX()+", "+pointA.getY()+")");
		if(pointB != null)
			System.out.println("pointB("+pointB.getX()+", "+pointB.getY()+")");
		if(pointC != null)
			System.out.println("pointC("+pointC.getX()+", "+pointC.getY()+")");
	}
	
}
