package com.bit.javaex.basic.reftype;

public class ArrayEx {
	public static void defineArray() {
		// 배열의 선언
		String[] names;	//	String names[] 와 동일
		int scores[];	//	int[] scores 와 동일
		
//		System.out.println(names);
		// 초기화
		names = new String[] {
				"홍길동", "전우치", "장길산"
		};	//	데이터가 이미 있는 경우 개수는 표기하지 않아도 된다
		
		// 선언시 이미 데이터를 알고 있을 때 
		int height[] = {
				175, 180, 177
		};	// 선언과 동시에 할 경우에만 가능
		
		scores = new int[4];	// 4개의 공간을 가진 빈 배열(값은 없음)
		// 내부 공간에 접근 : 인덱스를 사용. 0~(배열의 크기-1)까지. 배열의 크기 중요.
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 70;
//		scores[4] = 100;	// 배열 범위를 벗어남 : 에러
		
		// scores 배열의 점수를 합산, 총점과 평균을 출력
		int total = 0;
		
		for (int i = 0; i< scores.length; i++) {
			total += scores[i];			
		}
		
		System.out.printf("총점 %d, 평균 %.2f%n",
				total, (float)total/ scores.length);
	}
	
	public static void multiDim() {
		// 2차원 배열(3차원은 생략)
		int twodim[][] = new int[5][10];	
		// int[][] dim 가능. 5x10 5행 10열의 빈 배열 생성
		int table[][] = {	
			{1, 2, 3, 4, 5},
			{2, 3, 4, 5, 1},
			{3, 4, 5, 1, 2},
			{4, 5, 1, 2, 3}
		};
		// 5x4 배열. int table = new int [4][5] 와 동일
		// table.length == 4 확인
		System.out.println("table의 행 수 : " + table.length);
		// table[0] = {1, 2, 3, 4, 5}, table[0].length == 5 확인 
		// {1, 2, 3, 4, 5}로 출력되지는 않는다. 이후 추가로 배울 예정
		System.out.println("table의 0번 인덱스 : " + table[0]);
		System.out.println("table의 열 수 : " + table[0].length);
		
		// table 배열 안에 있는 모든 정수를 합산해보기 
		int total = 0;
		// 루프
		for (int row = 0; row < table.length; row++) {	// 행 루프
			for (int col = 0; col < table[row].length; col++) {
				// 열 루프
				int value = table[row][col];
				System.out.print(value + "\t");
				total += value;
			}
			System.out.println();
		}
		System.out.println("table의 총 합 :" + total);
	}
	
	public static void arrayCopy() {
		// 배열은 생성되면 크기를 변경할 수 없음
		// 더 큰 크기의 배열을 새로 생성 후 항목 값을 복사(루프 이용)
		int source[] = {1,2,3};
		int target[] = new int[10];		// 크기 10의 빈 배열 생성
		
		// 복사를 위해 loop
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];			
		}
		
		for (int i = 0; i < target.length; i++ ) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();		
		
		//Enhanced For (Loop)
		// 증감 변수 필요 없이 순차 자료형(배열 포함)의 각 요소를 
		// 첫번째 요소부터 끝까지 한 개씩 루프 (* 부분적으로는 System.arraycopy)
		for (int val : target) {
			// target 데이터의 타입이 int므로 꼭 맞춰서 사용해줘야함
			System.out.print(val + "\t");
		}
		System.out.println();
	}
	
	// System.arraycopy (부분적으로 위치를 지정하여 복사 가능)
	public static void arrayCopySystem() {
		int source[] = {1,2,3};
		int [] target = new int[10];
		
		System.arraycopy(source,	// 원본 배열
				0,	// 원본 배열의 시작 인덱스
				target, // 복사 대상인 새 배열
				5,	// 복사한 배열이 시작할 인덱스
				source.length);		// 복사할 길이
		
		for (int val: target) {
			System.out.print(val + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//defineArray();
		multiDim();
		//arrayCopy();
		//arrayCopySystem();

	}

}
