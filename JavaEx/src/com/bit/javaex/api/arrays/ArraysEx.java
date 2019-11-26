package com.bit.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {
	
	public static void arrayCopyEx() {
		// 배열의 복사 -> Array 클래스의 도움
		char src[] = "Java Programming".toUpperCase()
				.toCharArray();
		// 출력 : Arrays.toString()
		System.out.println("Arrays.toString : " 
		+ Arrays.toString(src));
		
		
		// 복사 : 원본 배열 src를 새 배열로 복사합시다
		char target[] = Arrays.copyOf(src, src.length);
		System.out.println("복제된 배열 : " + Arrays.toString(target));
		
		// src와 target 배열은 같은 객체인가?
		System.out.println(src == target);
		// 복제된 새 배열이기 때문에 같지 않음
		
		// 일부 복사 (부분 복제) : copyOfRange
		target = Arrays.copyOfRange(src, 5, 10);	
		// src 배열 5~10번 인덱스를 새 배열로 복사
		// 끝까지 넘어가면 빈 배열로 복사됨 (ex. 5, 19 할 경우 인덱스 3개가 빈 14개 배열)
		System.out.print("범위 복사 : " + Arrays.toString(target));
	}
	
	public static void sortEx() {
		// 정렬
		int scores[] = {88, 88, 89, 97, 95, 89, 94 };
		System.out.println("배열 원본 : " + Arrays.toString(scores));
		Arrays.sort(scores);	// 오름 차순
		System.out.println("기본 정렬 : " + Arrays.toString(scores));
		// 내림 차순
//		Arrays.sort(scores, reverseOrder());		
		Integer[] scores2 = {88, 88, 89, 97, 95, 89, 94 };
		Arrays.sort(scores2, Collections.reverseOrder());
		System.out.println("역순 정렬 : " + Arrays.toString(scores2));
	}
	
	public static void binarySearchEx() {
		// 기본 타입의 검색 
		int[] nums = {18, 8, 5, 19, 13, 16, 88}; 
				
		// nums로 부터 5를 검색해보기
		// binarySearch를 하기 위해서는 sort가 선행되어야한다
		Arrays.sort(nums);
		int index = Arrays.binarySearch(nums, 5);
		System.out.println("5의 인덱스 : " + index);
		System.out.println("nums 배열 : " + Arrays.toString(nums));
				
		// 문자열 검색도 가능 
		String[] words = "Java C C++ Python Linux".split(" ");
		// words 배열 내부에서 Python 찾기
		Arrays.sort(words);
		index = Arrays.binarySearch(words, "Python");
		
		System.out.println("Python의 인덱스 : " + index);
		System.out.println(Arrays.toString(words));
	}
	
	public static void customClassSortEx() {
		// Member의 배열을 만들고 배열을 정렬
		Member[] members = {
			new Member("레이"),
			new Member("다이애나"),
			new Member("대너리스")
		};
		System.out.println("원본 배열 : " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬된 배열 : " + Arrays.toString(members));
	}
	
	
	public static void main(String[] args) {
		arrayCopyEx();
		//sortEx();
		//binarySearchEx();
		//customClassSortEx();
	}

}
