package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharStreamEx {

	// 프로젝트 내의 files 디렉터리 위치
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	
	static final String filename = rootPath + "char.txt";

	public static void main(String[] args) {
		writerTest();

	}
	
	private static void writerTest() {
		try (
				Writer writer = new FileWriter(filename);
			){
			writer.write("Himedia Academy\r\n");
			writer.write("Java IO Programming\r\n");
			writer.write("2024.11");
			// 버퍼 비우기
			writer.flush();
		} catch(FileNotFoundException e) {
			System.err.println("파일을 열 수 없습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
