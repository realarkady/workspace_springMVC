package com.blackrock.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public App() {	}

	public static void main(String[] args) {
		System.out.println("App start...");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.toString());
		
		System.out.println("App finish...");
	}

}
