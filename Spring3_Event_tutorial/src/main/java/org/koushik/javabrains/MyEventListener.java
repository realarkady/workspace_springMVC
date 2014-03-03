package org.koushik.javabrains;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener implements ApplicationListener{

	public MyEventListener() {
		// TODO Auto-generated constructor stub
	}

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("ApplicationEvent: " + event.toString());
	}

}
