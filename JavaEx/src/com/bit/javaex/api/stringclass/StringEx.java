package com.bit.javaex.api.stringclass;

public class StringEx {
	public static void stringBasic() {
		// 문자열의 생성
		// 문자열 : char 형 데이터가 여러개 연속으로 연결된 자료
		// *** 문자열은 한번 생성되면 변경되지 않음 (변경되는 것처럼 보일뿐)
		String s1 = "Java";	
		// 리터럴Literal 방식 : 실제 소스 코드에 직접 입력한 문자열
		String s2 = new String("Java");	// 메모리에 새로 생성된 문자열
		String s3 = "Java";	// s1과 마찬가지 
		// Literal 문자열은 값이 같으면 같은 객체다 (s1 == s3) 
		
		
		System.out.println(s1 == s2);	// s1과 s2는 같은 객체인가?
		// 값은 같아보이지만 두 형식은 실제로 일치하지 않는다 (s1 != s2)
		System.out.println(s1 == s3);	// s1과 s3는 같은 객체인가?
		
		// 문자열은 char 형의 집합이기 때문에 char의 배열로 문자열을 생성할 수 있다
		char[] letters = {'J', 'a', 'v', 'a' };
		String s4 = new String(letters);
		System.out.println(s4);	// char 배열로 만들어진 문자열
		
		// 기본 데이터형 자료가 있을 때 -> 문자열로 변경 (valueOf 메소드 사용)
		String s5 = String.valueOf(3.14159);
		System.out.println(s5);
	}
	
	public static void methodEx() {
		// String의 유용한 메소드들
		String str = "Java Programming is Fun?";
		
		// 길이 : .length() 메소드
		System.out.println("length : " + str.length());
		
		// 변환 메소드
		System.out.println("UPPERCASE : " + str.toUpperCase());
		System.out.println("LOWERCASE : " + str.toLowerCase());
		// 문자열은 변경 불가 자료이기 때문에 변환 메소드를 사용해도 
		// 원본은 바뀌지 않으므로 새로 할당 받아야한다 
		
		// 검색 관련 메소드
		System.out.println("contatins : " + str.contains("Java"));
	
		// 5번 인덱스의 char은 무엇인가
		System.out.println("charAt : " + str.charAt(5));
		System.out.println("indexOf : " + str.indexOf("Fun"));
			// 문자열 내부에서 Fun의 index 반환 
		System.out.println("lastIndexOf : " + str.lastIndexOf("Fun"));
			// 문자열 내부에서 검색하되 뒤에서 부터 검색(방향이 다름)
		System.out.println("없는 검색어의 인덱스 : "
				+ str.indexOf("FUN"));
		
		String str2 = "I Like Java, I Like Python";
		int i = str2.indexOf("Like");	// str2 내의 Like의 위치(인덱스)
		System.out.println("Like index : " + i);
		i = str2.indexOf("Like");
		i += "Like".length();
		i = str2.indexOf("Like", i);
		System.out.println("Like 2nd index : " + i);
		// 검색범위를 좁히지 않으면 여전히 2로 나오기 때문에, Like 이후로 검색 인자
		
		//문자열 추출 : substring
		// str로부터 Programming 문자열 추출
		System.out.println("substring : " + str.substring(0,15));
		// 두번째 인자값은 endIndex인데 endIndex 직전까지 추출
		// -> g까지가 인덱스 15지만 출력은 g가 빠진 programmin까지 됨
		// str 5번 인덱스~끝까지 추출하고 싶다면
		System.out.println("substring 끝까지 : " 
				+ str.substring(5));	
		// 시작 인덱스만 부여(endIndex(str.length) 생략가능) 
		
		// 치환 메소드 : replace (특정 문자열을 다른 문자열로 치환할 때)
		// str 2: I Like Java, I Like Python
		// str 2의 Like -> like로 변환
		System.out.println(str2.replace("Like", "like"));
		
		// 공백 문자 제거 : trim()	*** PPT에 없음
		String str3 = "        Hello     "; 
		// 데이터가 넘어올 경우 정제되지 않은 데이터가 있을 수 있음
		str3 = str3.trim();	// 공백 문자 제거
		System.out.println("trim : " + str3);
		
		// 문자열 분리 : split()
		String[] chunks = str.split(" ");	
		// 공백 문자를 기준으로 분리 -> 문자열 배열로 생성 -> 어절로 분리됨
		
		for (String word : chunks) {
			System.out.println("word : " + word);
		}
	}
	
	public static void stringBufferEx() {
		// String 버퍼는 내부에 버퍼(임시 공간)을 가지고 있는 자료형
		// String 객체가 매번 새 객체를 생성하는데 반해
		// String 버퍼는 내부 버퍼에서 모든 작업을 수행한다 
		// 가변적이며, 메모리 효율이 좋다
		// This is my pencil
		StringBuffer sb = new StringBuffer("This");
		// 뒤에 문자열 추가 : .append()
		sb.append(" is pencil");	// 문자열의 삽입 (맨 뒤)
		sb.insert(7, " my");	// 문자열의 삽입 (중간)
		System.out.println(sb);
		sb.replace(7, 10, " your");	// 문자열의 변경 (중간)
		System.out.println(sb);
		
		// 메소드 체이닝 (chaining)
		StringBuffer sb2 = new StringBuffer("This")
			.append(" is")
			.append(" pencil")
			.insert(8, " my")
			.replace(8, 11, "your ");
			String s = sb2.toString();	// 문자열로 최종 변환
			System.out.println(s);
		
	}
	public static void main(String[] args) {
		//stringBasic();
		//methodEx();
		stringBufferEx();

	}

}
