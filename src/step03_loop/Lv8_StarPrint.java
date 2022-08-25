package step03_loop;

import java.util.Scanner;

// BaekJoon 문제 2438번
// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//예제 입력1 		예제 출력1
//5
				//    *
				//   **
				//  ***
				// ****
				//*****

public class Lv8_StarPrint {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		for (int value = 0; value < num; value++) {
			for (int i = n; i - 1 > 0; i--) {
				System.out.print(" ");
			}
			for (int k = 0; k < (num - n) + 1; k++)
				System.out.print("*");
			n--;
			System.out.println();
		}
	}
}
