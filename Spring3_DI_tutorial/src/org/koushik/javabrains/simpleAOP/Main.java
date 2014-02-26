package org.koushik.javabrains.simpleAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public Main() {	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context_simpleAOP.xml");
		IShape shapeOne = (IShape) context.getBean("triangle");
		IShape shapeTwo = (IShape) context.getBean("circle");
		shapeOne.draw();
		shapeTwo.draw();
	}

}
