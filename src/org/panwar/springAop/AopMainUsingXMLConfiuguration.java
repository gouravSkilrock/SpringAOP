package org.panwar.springAop;

import org.panwar.springAop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.metadata.GenericTableMetaDataProvider;

public class AopMainUsingXMLConfiuguration {

	/**
	 * AOP XML Configuration main java file
	 * @param call by argument
	 * Author : Gourav panwar
	 */
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springAop.xml");
		ShapeService shapeService=(ShapeService)context.getBean("shapeServiceXml");
		shapeService.getTriangle().triangleArguemntMethod("Aop XML Example Successfully executed !!!");
	}

}
