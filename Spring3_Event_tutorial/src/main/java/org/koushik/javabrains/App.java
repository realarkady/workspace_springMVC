package org.koushik.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
	}

}
