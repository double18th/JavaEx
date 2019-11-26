package com.bit.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharEx {
	static String dirName = "D:\\javastudy\\files";
	static String source = 
			dirName + "\\last-leaf.txt";
	static String target = 
			dirName + "\\last-leaf-filtered.txt";

	public static void main(String[] args) {
		// last-leaf.txt 에서 줄 단위로 읽은 후  
		// leaf나 leaves가 들어있는 문장만 
		// 별도로 last-leaf-filtered.txt로 저장 
		
		try {
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);
			
			// 보조 스트림 연결
			BufferedReader br = 
					new BufferedReader(fr);
			BufferedWriter bw = 
					new BufferedWriter(fw);
			
			String line = "";
			while((line = br.readLine()) != null) {
				// readLine 메소드 -> BufferdReader의 추가 메소드
				// 읽어올 내용이 없으면 null
				// 라인 내에 leaf, leaves가 있는지 확인
				// 대소문자를 구분하므로 일괄 소문자로 변경 후 포함 여부 확인 진행
				if (line.toLowerCase().contains("leaf") || 
						line.toLowerCase().contains("leaves")) {
					System.out.println(line);	
					// 필터링된 내용을 BufferdWriter로 출력
					bw.write(line);
					bw.write("\r\n");	// 개행
					bw.flush(); 		// 버퍼를 비우고 출력 
				}				
			}
			System.out.println("필터링 완료");
			fw.close(); fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
