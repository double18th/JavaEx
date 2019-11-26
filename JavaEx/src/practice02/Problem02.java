package practice02;

import java.util.Scanner;

public class Problem02 {
	// 5개의 숫자를 키보드로 입력받아 배열에 저장 후 평균 구하기
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num[];
		num = new int[5];
		int total = 0;
		for (int i = 0; i<5; i++) {
			int num2 = scanner.nextInt();
			num[i] = num2;
			total += num[i];
		}
		double avg = (double)total/5;
//		System.out.printf("평균은 %d 입니다. %n", avg);
		System.out.println("평균은 " + avg + " 입니다.");
	scanner.close();	
	}

}
