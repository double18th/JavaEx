package practice01;

public class Problem03 {

	public static void main(String[] args) {
		/* 구구단 출력
		for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
			System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		*/
		// 구구단 가로로 출력
		for (int k = 1; k <= 9; k++) {
			for (int m = 2; m <= 9; m++) {
			System.out.print(m + "*" + k + "=" + m*k);
			//System.out.print("\t");
			//System.out.printf("%d*%d=%d", m,k,m*k);
			System.out.print("\t");
			}
		System.out.print("\n");		
		// println 을 쓰면 \n을 넣을 필요가 없고, \n을 넣고 싶으면 print 사용 
		}
		
	}

}
