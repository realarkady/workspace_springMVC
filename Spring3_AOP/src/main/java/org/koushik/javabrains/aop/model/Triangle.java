package org.koushik.javabrains.aop.model;

public class Triangle{
	private String name;
	
	public Triangle() {	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void draw() {
		System.out.println(name);
		/*
		if(pointA != null)
			System.out.println("pointA("+pointA.getX()+", "+pointA.getY()+")");
		if(pointB != null)
			System.out.println("pointB("+pointB.getX()+", "+pointB.getY()+")");
		if(pointC != null)
			System.out.println("pointC("+pointC.getX()+", "+pointC.getY()+")");
		*/
	}
	
}
