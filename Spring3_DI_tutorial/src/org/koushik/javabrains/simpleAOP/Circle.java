package org.koushik.javabrains.simpleAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements IShape{
	private Point centre;
	
	public Circle() {	}
	
	public Circle(Point centre) {
		super();
		this.centre = centre;
	}
	
	public Point getCentre() {
		return centre;
	}
	
	@Autowired
	@Qualifier("centreCircle")
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	
	@Override
	public void draw() {
		if(centre != null)
			System.out.println("pointA("+centre.getX()+", "+centre.getY()+")");
		else
			System.out.println("centre is null");
	}
	
}
