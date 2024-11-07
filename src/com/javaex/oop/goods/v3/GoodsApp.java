package com.javaex.oop.goods.v3;

// Goods v3. 생성자
// 생성자가 만들어져 있지 않으면 JVM이 기본생성자를 끼워 넣는다
// 개발자가 생성자를 만들면 JVM은 기본생성자를 끼워넣지 않는다.
// Setter 가 없으면? Read-Only
class Goods {
	// 필드

	private String name;
	private int price;

	// 생성자 (위치 = 필드 바로 밑)
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// Getters / Setters
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//		// this -> 현재 인스턴스 자체
//	}

	public int getPrice() {
		return price;
	}

//	public void setPrice(int price) {
//		this.price = price;
//	}

	// 일반 메서드
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.printf("가격: %,d원%n\n", price);
	}

}

// Goods 테스트 클래스
public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods();

//		camera.setName("Nikon");
//		camera.setPrice(400_000);
		Goods camera = new Goods("Nickon", 400_000);
		camera.showInfo();

//		Goods notebook = new Goods();
//		notebook.setName("LG그램");
//		notebook.setPrice(900_000);
		Goods notebook = new Goods("LG그램", 900_000);
		notebook.showInfo();
		
//		System.out.printf("%s -> %,d%n", notebook.name, notebook.price);
//		System.out.printf("%s -> %,d%n", notebook.getName(), notebook.getPrice());

//		Goods mug = new Goods();
//		mug.name = "머그컵";
//		mug.price = 2_000;
//		mug.setName("머그컵");
//		mug.setPrice(2_000);
		Goods mug = new Goods("머그컵", 2_000);
		mug.showInfo();

//		System.out.printf("%s -> %,d%n", mug.name, mug.price);
//		System.out.printf("%s -> %,d%n", mug.getName(), mug.getPrice());

	}

}
