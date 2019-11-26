package practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// 입력 받은 숫자가 홀수 : 입력 값까지 홀수의 합
		// 입력 받은 숫자가 짝수 : 입력 값까지 짝수의 합
			
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자를 입력하세요");
	int a = scanner.nextInt();	
	int total = 0;
	if (a % 2 == 0) {
		for (int b = 0; b<=a; b = b + 2) {
		total += b;	
		}
	} else {
		for (int b = 1; b<=a; b = b + 2) {
		total += b;
		}
	}
	
	System.out.println("결과값 : " + total);
	scanner.close();
	}

}
