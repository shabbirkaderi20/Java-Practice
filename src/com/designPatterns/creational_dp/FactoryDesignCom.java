package com.designPatterns.creational_dp;

/**
* 
* @author skaderi
* 
*
*/

interface Objects {
	
	void drawShape();
}

class Circle implements Objects{

	@Override
	public void drawShape() {
		
		System.out.println("I am a Circle");
	}
}

class Rectangle implements Objects{

	@Override
	public void drawShape() {
		
		System.out.println("I am a Rectangle");
	}
}

class Triangle implements Objects{

	@Override
	public void drawShape() {
		
		System.out.println("I am a Triangle");
	}
}

class ShapeFactory {
	public Objects getInstance(String shape) throws Exception {
		
		switch(shape) {
			case "circle": return new Circle();

			case "rectangle": return new Rectangle();

			case "triangle": return new Triangle();

			default: throw new Exception();
		}
	}
}

public class FactoryDesignCom {
	public static void main(String[] args) {
		
		ShapeFactory sf= new ShapeFactory();
		
		try {
			sf.getInstance("circle").drawShape();
			sf.getInstance("triangle").drawShape();
			sf.getInstance("rectangle").drawShape();
			sf.getInstance("rhombus").drawShape();
		}catch(Exception ee) {
			System.out.println("Shape under design");
		}
	}
}
