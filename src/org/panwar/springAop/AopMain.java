package org.panwar.springAop;

import org.panwar.springAop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	/**
	 * 
	 * Aop main Class
	 * Author : Gourav Panwar
	 */
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("springAop.xml");
		ShapeService shapeService=context.getBean("shapeService",ShapeService.class);
		shapeService.getCircle().setName("Dummy name");
		System.out.println(shapeService.getCircle().getName());

	}

}
