package com.bit.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferdStreamEx {
	static String dirName = "D:\\javastudy\\files";
	static String source = dirName + "\\img.jpg";
	static String target = dirName 
			+ "\\img_bufferd_copy.jpg";
	// 보조 스트림을 활용한 성능 향상 
	// 데코레이터 패턴 
	public static void main(String[] args) {
		try {
			// 파일 스트림 열기
			InputStream fis = new FileInputStream(source);
			OutputStream fos = 
					new FileOutputStream(target);
			
			// 성능 향상을 위한 Buffer 기반 보조 스트림을 연결
			BufferedInputStream bis = 
					new BufferedInputStream(fis);
			// 보조 스트림은 입출력 기능은 없으며 부가적 기능만 추가 수행하므로
			// 앞의 메인 스트림을 넘겨받아야함
			BufferedOutputStream bos = 
					new BufferedOutputStream(fos);
			
			byte[] data = new byte[1024];	// 1KB 버퍼 
			int size = 0;	// 읽어들인 byte 수 (리턴 값)
			
			while ((size = bis.read(data)) != -1) {
				bos.write(data);
				System.out.println(size + "바이트 복사");
			}
			
			System.out.println("파일 복사 완료");
			bos.close();
			bis.close();
			//보조 스트림을 close하면 주main스트림도 함께 close된다
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
