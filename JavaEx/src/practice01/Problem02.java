package practice01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// 스캐너 + 숫자 출력
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for (int i = 1; i<=a; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(i);				
			}
			System.out.println();
		}
		scanner.close();
	}
}
