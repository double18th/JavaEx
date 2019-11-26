package com.bit.javaex.io;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String dirName = "D:\\javastudy\\files";
	// File Class 예제 
	public static void main(String[] args) {
		// File 객체
		// 		-> new File을 하더라도 실제 생성되는 것은 아님
		//		-> 해당 파일 정보를 확인하는 클래스
		File root = new File(dirName);
		// 파일이 실제 존재하는지 확인
		System.out.println(dirName + ":" + root.exists());
		// 어떤 파일이나 디렉토리를 만들고자할 때 
		// 해당 파일이 존재하는지 먼저 확인 후 생성
		if (!root.exists()) {
			// 디렉토리 만들기
			root.mkdirs();	// 하위 디렉토리 일괄생성 (mkdir과 다름)
		}
		// 디렉토리 안에 새 파일 만들어 넣기
		File file = new File(dirName + "\\myfile.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 오류가 날 가능성이 높으므로 컴파일러가 예외 처리를 강제한다
		}
		
		// 지정된 디렉토리 내부의 정보를 출력하는 메소드 
		printInfo(root);
		
		// 파일 지우기 (myfile)
		if (file.exists()) {
			file.delete();
		}
		printInfo(root); 
	}
	
	static void printInfo(File f) {
		// 파일 정보를 넘겨받아서
		// 만약 디렉토리라면 내부의 파일 목록을 출력하고 
		// 아닐 경우는 파일의 속성을 출력
		System.out.println("File list");
		// 넘겨받은 파일이 디렉토리인지 확인
		if (f.isDirectory()) {
			// 디렉토리이므로 내부의 파일을 담고 있을 것
			File[] files = f.listFiles(); 		// 파일의 목록
			System.out.println("Directory : " + f.getName());
			// 파일 목록 출력
			for (File file : files) {
				System.out.print(file.isDirectory() ? "d" : "f");
				System.out.println(file.getName()
						+ " " + file.length());
			}
		} else {
			// 디렉토리가 아님
			System.out.println("File : " + f.getName());
		}
		
	}
	
}
