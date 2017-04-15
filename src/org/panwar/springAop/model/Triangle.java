package org.panwar.springAop.model;

public class Triangle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void triangleArguemntMethod(String argString){
		System.out.println("My argument String is : "+argString);
	}
}
