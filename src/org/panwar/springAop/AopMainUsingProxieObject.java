package org.panwar.springAop;

import org.panwar.springAop.service.FactoryService;
import org.panwar.springAop.service.ShapeService;

public class AopMainUsingProxieObject {

	/**
	 * Example of Proxy object 
	 * @param args
	 * How spring manage manually all implementation
	 * 
	 *  Author : Gourav Panwar
	 */
	public static void main(String[] args) {
		
		FactoryService factoryService=new FactoryService();
		ShapeService shapeService=(ShapeService) factoryService.getBean("shapeService");
		shapeService.getCircle();
	}

}
