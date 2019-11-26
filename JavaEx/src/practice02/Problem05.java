package practice02;

public class Problem05 {
	// 배열 내 85점 이상인 점수만 뽑아 합과 평균값 산출
	public static void main(String[] args) {
		
		int scoreboard[][] = {
				{ 80, 75, 90, 95, 78 },
				{ 92, 88, 89, 92, 70 },
				{ 78, 80, 85, 86, 63 },
				{ 83, 84, 89, 87, 75 },
				{ 89, 83, 93, 94, 78 },
		};
		int total = 0, count = 0;
		
		for (int i = 0; i < scoreboard.length; i++) {
			for (int j = 0; j < scoreboard[i].length; j++) {
				if (scoreboard[i][j] >= 85) {
					count++;
					total += scoreboard[i][j];
				}
			}
		}
		System.out.printf(
				"주어진 점수 내 85점 이상은 %d개이며 총 합은 %d이다.%n", 
				count, total);
	}
}

// 행별로 85 이상인 애들을 저장 / 카운트 올려줌
//토탈/카운트 

