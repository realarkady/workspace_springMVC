package org.koushik.javabrains.aop.model;


public class Circle{
	private String name;
	
	public Circle() {	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//throw new RuntimeException();
	}

	public String setNameOne(String name, String name1) {
		this.name = name;
		//throw new RuntimeException();
		return name + name1;
	}

	public void draw() {
		System.out.println(name);
		/*
		if(centre != null)
			System.out.println("pointA("+centre.getX()+", "+centre.getY()+")");
		else
			System.out.println("centre is null");
		*/
	}
	
}
