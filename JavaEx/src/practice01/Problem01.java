package practice01;

public class Problem01 {

	public static void main(String[] args) {
		// 1~100 중 5의 배수이면서 7의 배수인 수 출력
		// for문 
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		// while문
		int num = 1;
		while(num<=100) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}
}