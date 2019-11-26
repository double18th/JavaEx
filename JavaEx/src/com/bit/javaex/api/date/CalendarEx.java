package com.bit.javaex.api.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// 캘린더의 획득
		Calendar now = Calendar.getInstance();
		// 캘린더는 new로 생성할 수 없고
		// getInstance() 메서드로 객체를 얻을 수 있다
		Calendar custom = Calendar.getInstance();
		// custom 캘린더의 날짜를 바꿔보기
		custom.set(Calendar.YEAR, 2012);
		custom.set(Calendar.MONTH, 5);	// 월은 0부터 시작하므로 실제로 6월
		custom.set(Calendar.DATE, 27);
		
		// set 메소드를 이용, 년 월 일 시 분 초를 일괄 변경할 수도 있다
		custom.set(2012, 05, 27); 
		
		// 출력
		System.out.printf("오늘은 %d년 %d월 %d일입니다.%n",
				now.get(Calendar.YEAR),
				now.get(Calendar.MONTH) + 1,	
				// Calendar의 Month 정보는 0부터 시작하므로 꼭 +1
				now.get(Calendar.DATE));
		
		// 미래로 가봅시다
		Calendar future = Calendar.getInstance();	// 현재
		// 10년 후 오늘로 가봅시다 : add 메소드
		future.add(Calendar.YEAR, 10); 	// 캘린더의 년도 필드에 10을 합산 
		
		// 이 날은 어떤 날일까
		System.out.printf("10년 뒤 오늘 : %d년 %d월 %d일%n", 
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH),
				future.get(Calendar.DATE));
		
		// 이 날은 무슨 요일일까
		System.out.println("요일 : " + 
		future.get(Calendar.DAY_OF_WEEK));	// 숫자로 출력되므로 
		
		int dow = future.get(Calendar.DAY_OF_WEEK);
		switch (dow) {
		case Calendar.SUNDAY : 
			System.out.println("일요일");
			break;
		case Calendar.MONDAY :
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY :
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY :
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY :
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY :
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY :
			System.out.println("토요일");
			break;
		}
		
	

	}

}
