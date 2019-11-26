package practice02;

public class Problem04 {
	// 배열을 사용하여 1~45 숫자 중 임의의 6개 숫자 출력하기. 중복 체크 필수
	public static void main(String[] args) {
		
		int num[];
		num = new int[6];
		// int []num = new int[6]; 가능
		
		for (int i = 0; i <6; i++) {
		num[i] = (int)(Math.random()*45) + 1;
		
//			if (num[i] == num[(i-1)]) {
				System.out.println(num[i]);
//			} else {
//				num[i] = (int)(Math.random()*45) + 1;
//			}
		}
	}
}
