package step03_loop;

import java.util.Scanner;

//BaekJoon 문제 25304번 
//영수증에 적힌, 구매한 각 물건의 가격과 개수, 구매한 물건들의 총 금액을 보고
//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

//예제 입력1 		예제 출력1
//260000		Yes (No)
//4
//20000 5
//30000 2
//10000 6
//5000 8			

public class Lv4_Receipt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int cost = sc.nextInt(); // 계산한금액
		int tc = sc.nextInt(); // 테스트케이스 (항목이몇종류인가)
		int[][] array = new int[tc][2];
		for (int i = 0; i < tc; i++) {
			for (int k = 0; k < 2; k++) {
				int value = sc.nextInt();
				array[i][k] = value;
			}
		}

		int sum = 0;
		int lastsum = 0;

		for (int i = 0; i < tc; i++) {
			sum = array[i][0] * array[i][1];
			lastsum += sum;
		}

		if (cost == lastsum) {
			System.out.println("Yes");
		}

		else {
			System.out.println("No");
		}
	}
}
