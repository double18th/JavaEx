package alone;

import java.util.Arrays;
import java.util.Scanner;

public class Div {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("자연수를 입력해주세요>");
        int div = sc.nextInt();

      int count = 0;
        int arr[] = {1,8,2,6,3,9,4,5,7,10};
        Arrays.sort(arr);
        for (int num: arr) {
           if (num % div == 0) {
               count++;
           }
        }
        
        int res[];
        if (count == 0) {
        	res = new int[1];
        	res[0] = -1;
           
        } else {
        	res = new int[count];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
              if (arr[i] % div == 0) {
                  res[j++] = arr[i];
              }
           }
        }  
        
        System.out.print(Arrays.toString(res));
        sc.close();
   }
}