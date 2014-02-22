package org.koushik.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public Main() {	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context_di.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
