package org.koushik.javabrains.beanPostProcessing;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{
	
	public DisplayNameBeanPostProcessor() {	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("in postProcessAfterInitialization. Bean name is: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("in postProcessBeforeInitialization. Bean name is: " + beanName);
		return bean;
	}
	
	
}
