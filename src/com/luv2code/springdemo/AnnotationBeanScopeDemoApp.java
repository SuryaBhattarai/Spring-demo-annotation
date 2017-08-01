package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieving the bean form spring container
		 Coach theCoach =context.getBean("tennisCoach", Coach.class);
		 
		 Coach alphaCoach =context.getBean("tennisCoach", Coach.class);
		 
		 // check if they are same
		 boolean result = (theCoach == alphaCoach);
		 
		 // print out the result
		 System.out.println("\nPointing to the saem object :" + result);
		 System.out.println("\nMemory location for theCoach:" + theCoach);
		 
		 System.out.println("\nMemory location for alphaCoach:" + alphaCoach + "\n");
		 
		 // Close the context
		 context.close();
		 
	}

}
