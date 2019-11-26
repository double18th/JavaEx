package com.bit.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static String dirName = "D:\\javastudy\\files";
	static String fileName = dirName + "\\thieves.txt";
	
	public static void main(String[] args) {
		// FileReader + BufferedReader + StringTokenizer 조합해서
		// thieves.txt로부터 데이터 읽어오기
		try {
			// 메인 스트림 열기
			Reader fr = new FileReader(fileName);
			// 보조 스트림 연결
			BufferedReader br = new BufferedReader(fr);
			
			String thief = "";
			while ((thief = br.readLine()) != null) {
//				System.out.println(thief);
				StringTokenizer st = new StringTokenizer(thief + ",");
				// StringTokenizer를 이용한 문자열 분리
				while(st.hasMoreElements()) {
					String token = st.nextToken();
					System.out.print(token + " ");
				}
				System.out.println();
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
