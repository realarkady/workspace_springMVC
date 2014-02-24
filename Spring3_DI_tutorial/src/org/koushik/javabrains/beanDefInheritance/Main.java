package org.koushik.javabrains.beanDefInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public Main() {	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context_beanDefInheritance.xml");
		Triangle triangle1 = (Triangle) context.getBean("triangle1");
		Triangle triangle2 = (Triangle) context.getBean("triangle2");
		triangle1.draw();
		triangle2.draw();
	}

}
