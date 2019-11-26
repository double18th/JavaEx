package practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// 숫자 다섯개를 입력받아 가장 큰 수 출력
		int num[];
		num = new int[5];
		
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<num.length; i++) {
			System.out.print("숫자 : ");
			num[i] = scanner.nextInt();	
		}
		int maxnum = num[0];
			for (int i = 1; i <num.length; i++) {
				if (maxnum < num[i]) {
					maxnum = num[i];
				} else {
					continue; 
				}					
			}
		System.out.printf("최대값은 %d입니다." , maxnum);
		scanner.close();
	}
}
