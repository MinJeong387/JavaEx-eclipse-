package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		// 추상 클래스는 부모로서만 존재
//		Shape s = new Shape();
		
		Rectangle r = new Rectangle(10,20,100,50);
		r.draw();
		
		Circle c = new Circle(10,10,30);
		c.draw();
		
		Point p = new Point(100,100);
		p.draw();
		
	}

}
