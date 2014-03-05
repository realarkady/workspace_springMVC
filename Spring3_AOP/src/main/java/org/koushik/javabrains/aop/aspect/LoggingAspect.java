package org.koushik.javabrains.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	public LoggingAspect() {	}
	
	@Before("allGetters()")
	public void LoggingAdvice(){
		System.out.println("@Before LoggingAspect.LoggingAdvice()");
	}
	
	@Before("allCircleMethods()")
	public void LoggingAdviceAllCircle(JoinPoint jp){
		System.out.println("@Before LoggingAspect.LoggingAdviceAllCircle()");
		System.out.println(jp.toString());
	}
	
	@Before("args(name)")
	public void LoggingAdviceAllCircle(String name){
		System.out.println("@Before name: " + name);
	}
/*
	@After("args(name, name1)")
	public void LoggingAdviceAfterAllCircle(String name, String name1){
		System.out.println("@After name: " + name + "   @After name: " + name1);
	}
*/
	@AfterReturning(pointcut="args(name, name1)", returning="returningName")
	public void LoggingAdviceAfterAllCircle(String name, String name1, String returningName){
		System.out.println("@AfterReturning name: " + name + "\t@AfterReturning name: " + 
				name1 + "\t@AfterReturning returningName: " + returningName);
	}
	
	@AfterReturning("args(name)")
	public void LoggingAdviceAfterReturningAllCircle(String name){
		System.out.println("@AfterReturning name: " + name);
	}
	
	@AfterThrowing("args(name)")
	public void LoggingAdviceAfterThrowingAllCircle(String name){
		System.out.println("@AfterThrowing name: " + name);
	}
	
	@Around("@annotation(org.koushik.javabrains.aop.aspect.Loggable)")
	public Object LoggingAdviceAroundAnnotation(ProceedingJoinPoint proceedingJoinPoint){
		Object returningValue = null;
		
		try {
			System.out.println("@Around Loggable before: ");
			returningValue = proceedingJoinPoint.proceed();
			System.out.println("@Around Loggable after returning: ");
		} catch (Throwable e) {
			System.out.println("@Around Loggable after throwing: ");
		}
		System.out.println("@Around Loggable after finally: ");
		return returningValue;
	}
	/*
	@Around("allGetters()")
	public Object LoggingAdviceAroundAllGetters(ProceedingJoinPoint proceedingJoinPoint){
		Object returningValue = null;
		
		try {
			System.out.println("@Around before: ");
			returningValue = proceedingJoinPoint.proceed();
			System.out.println("@Around after returning: ");
		} catch (Throwable e) {
			System.out.println("@Around after throwing: ");
		}
		System.out.println("@Around after finally: ");
		return returningValue;
	}
	*/
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	@Pointcut("within(org.koushik.javabrains.aop.model.Circle)")
	public void allCircleMethods(){}
	
	
}
