package practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		// 숫자 맞추기 게임
	System.out.println("====================");
	System.out.println("  [숫자맞추기게임 시작]");
	System.out.println("====================");
	int answer = 88; int num;
	Scanner scanner = new Scanner(System.in);
		
	do {
		System.out.print(">>");
		num = scanner.nextInt();
		if (num > answer) {
			System.out.println("더 낮게");
		} else if (num == answer) {
			continue;
		} else {
			System.out.println("더 높게");
		} 
	}	
		while (num != answer); 
		
	System.out.print("맞았습니다.\n게임을 종료하시겠습니까?(y/n) >>");
	String con = scanner.next();
		switch(con) {
		case "y" :
			System.out.println("====================");
			System.out.println("  [숫자맞추기게임 종료]");
			System.out.println("====================");
			break;
		case "n" : 
			num = answer;
		default : 
			System.out.println("다시 입력해주십시오");
		}
		scanner.close();
	}
}

// 게임 종료 후 재시작이 안됨