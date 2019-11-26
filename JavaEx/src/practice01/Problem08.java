package practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// 1. 예금 : 예금 합산, 2. 출금 : 예금 차감
		// 3. 잔고 : 잔고 출력, 4. 종료 : 종료, 그외 : "다시 입력해주세요"

	Scanner scanner = new Scanner(System.in);
	int total = 0; int sol;
	
	do {		
	System.out.println("------------------------------");
	System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
	System.out.println("------------------------------");
	System.out.print("선택>");
	sol = scanner.nextInt();
		switch (sol) {
			case 1 :
				System.out.print("예금액>");
				int num = scanner.nextInt();
				total = total + num;				
			break; 
			case 2 :
				System.out.print("출금액>");
				int num2 = scanner.nextInt();
				if (total >= num2) {
				total = total - num2;
				} else {
					System.out.println("잔액이 부족합니다");
				}				
			break;
			case 3 :
				System.out.print("잔고액>" + total + "\n");
			break;
			case 4 :
				continue;
			default  : 
				System.out.println("다시 입력해주세요");
		}
	}
		while (sol != 4);
	System.out.println("프로그램 종료");
	scanner.close();
	}
}