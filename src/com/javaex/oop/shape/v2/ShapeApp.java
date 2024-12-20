package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		// 추상 클래스는 부모로서만 존재
//		Shape s = new Shape();

		Rectangle r = new Rectangle(10, 20, 100, 50);
		r.draw();

		Circle c = new Circle(10, 10, 30);
		c.draw();

		Point p = new Point(100, 100);
		p.draw();

		
		Drawable[] objs = new Drawable[] { r, c, p };

		// 특정 객체가 특정 인터페이스를 구현한 객체인가를 판단하려면 (instanceof 의 두번째 기능)
		if (r instanceof Drawable) {
			System.out.println("r은 Drawable의 구현체입니다.");
		}
		System.out.println();
		for (Drawable obj : objs) {
			obj.draw();
		}

	}

}
