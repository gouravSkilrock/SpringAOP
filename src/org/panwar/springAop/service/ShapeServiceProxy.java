package org.panwar.springAop.service;

import org.panwar.springAop.aspect.LoggingAspectUsingAopXmlConfiguration;
import org.panwar.springAop.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle() {
		new LoggingAspectUsingAopXmlConfiguration().myNewLoginAdvice();
		return super.getCircle();
	}
}
