package com.bit.javaex.api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// 날짜를 얻어옴
		// java.util 패키지 안에 있기 때문에 명시적으로 import 해야함
		Date now = new Date();
		String nowStr = now.toString();
		
		System.out.println("현재 시간 : " + nowStr);
		System.out.println(now.toLocaleString());
		// Locale : 미국) 일-월-년, 한국) 년-월-일 
		// deprecated -> 향후에는 없어질 예정이므로 다른 방식을 사용하자
		
		// 날짜 출력 형식 사용
		DateFormat df = DateFormat
				.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(now));
		
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));
		
		// DateFormat FULL, LONG, MEDIUM, SHORT
		
		// SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("포매팅된 날짜 정보 : " + sdf.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat(
				"yy MMM dd, a hh:mm:ss");
		System.out.println("다른 표기 : " + sdf2.format(now));
		
		// Locale.ENGLISH 하지 않으면 미국식 JAN 으로 표기안되고 1월로 표기
				

	}

}
