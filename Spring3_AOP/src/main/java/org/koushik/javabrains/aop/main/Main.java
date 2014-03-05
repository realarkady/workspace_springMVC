package org.koushik.javabrains.aop.main;

import org.koushik.javabrains.aop.model.Circle;
import org.koushik.javabrains.aop.model.IShape;
import org.koushik.javabrains.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public Main() {	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/koushik/javabrains/aop/main/context.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().setName("new circle name");
		shapeService.getCircle().setNameOne("new circle name", "new circle name1");
		System.out.println(shapeService.getCircle().getName());;
		//System.out.println(shapeService.getTriangle().getName());;
	}
	
}
