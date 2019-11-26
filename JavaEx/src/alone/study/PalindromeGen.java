package alone.study;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//Palindrome Generator
public class PalindromeGen {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		// 5자리 팰린드롬만 출력 
		String[] answer;
		answer = new String[3];
		for (int i = 0; i < 3; i++) {
			String randomStr = 
					String.valueOf((char)((int)(rnd.nextInt(26)) + 65));
			answer[i] = randomStr;
		}
		
		for (int j = 0; j < answer.length; j++) {
			System.out.print(answer[j]);
		} 
		System.out.print(answer[1] + answer[0]);
		System.out.println();
		
		// 원하는 길이 출력
		 System.out.println("생성하실 팰린드롬 문자열의 길이를 입력해주십시오");
		 System.out.print("정수>");
		   	try {
		   		Scanner sc = new Scanner(System.in);
		   	   	int num = sc.nextInt();
		   		if (num % 2 == 1 && num > 0) {
		   			String [] pd;
		   			pd= new String[(num/2)+1];	  						
		   			
		   			for (int i = 0; i < pd.length; i++) {
		   				String randomStr = 
								String.valueOf((char)((int)(rnd.nextInt(26)) + 65));
						pd[i] = randomStr;
						System.out.print(pd[i]);
		   			}
		   			
		   			for (int k = pd.length-2; k > -1; k-- ) {
		   				System.out.print(pd[k]);
		   			}
						
				} else if (num % 2 == 0 && num > 0) { 
				 	System.out.println("[홀수를 입력해주십시오]");
				} else {
					System.out.println("[0 이상의 정수를 입력해주십시오]");
				}
		   		sc.close();	
		   		
		   	} catch (InputMismatchException e) {
		   		System.out.println("[숫자를 입력해주십시오]");
		   	} catch (Exception e) {
		   		e.printStackTrace();
		   	}
	}
}
