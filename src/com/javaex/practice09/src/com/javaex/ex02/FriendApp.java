package com.javaex.practice09.src.com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		
		List<Friend> friend = new ArrayList<Friend>();
		
		for (int i =0;i<3;i++) {
		
		String line = sc.nextLine();
		String tokens[] = line.split(" ");
		
		String name = String.valueOf(tokens[0]);
		String hp = String.valueOf(tokens[1]);
		String school = String.valueOf(tokens[2]);
		
		
		Friend friend[i]=new Friend(name,hp,school);
		}
		
		
		for (int i = 0; i < friend.size(); i++) {
		
		}
		
		

	}

}
