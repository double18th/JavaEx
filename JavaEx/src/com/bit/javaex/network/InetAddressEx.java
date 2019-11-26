package com.bit.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	// 1. 내 로컬 IP 확인
	// 2. 도메인 네임으로 서버 IP 확인
	public static void printLocalIP() {
		// InetAdress 클래스 : IP 확인
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.printf("Local IP:%s%n", 
					local.getHostAddress());
			System.out.printf("Local Host:%s%n", 
					local.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}	// 예외 처리 필수
	}
	
	public static void printServerIP(String hostname) {
		// hostname으로 명령된 서버의 IP, 확인 
		try {
			InetAddress[] addrs = InetAddress.getAllByName(hostname);
			// hostname에 연결된 모든 InetAdress 정보 반환 -> 배열, 루프 
			for (InetAddress remote:addrs ) {
				System.out.printf("%s IP: %s%n", 
						remote.getHostName(),
						remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}	// 예외 처리 필수
	}
	public static void main(String[] args) {
//		printLocalIP();
		printServerIP("www.naver.com");
		printServerIP("www.google.com");

	}

}
