package org.panwar.springAop.service;

import org.panwar.springAop.model.Circle;
import org.panwar.springAop.model.Triangle;

public class FactoryService {

	public Object getBean(String beanType){
		if(beanType.equals("shapeService")) return new ShapeServiceProxy();
		if(beanType.equals("triangle")) return new Triangle();
		if(beanType.equals("circle")) return new Circle();
		return null;
	}
}
