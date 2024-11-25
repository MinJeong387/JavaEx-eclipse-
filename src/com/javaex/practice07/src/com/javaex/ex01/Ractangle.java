package com.javaex.practice07.src.com.javaex.ex01;

public class Ractangle extends Shape {

	private int width;
	private int height;

	public Ractangle(String fillColor, int width, int height) {
		super(fillColor);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("[사각형]#면색:" + super.fillColor + " " + "#가로:" + width + " #세로:" + height + "그렸습니다.");
	}

	@Override
	public void showInfo() {
		System.out.println("sr1의 가로는 " + width + " 입니다.");
	}

}
