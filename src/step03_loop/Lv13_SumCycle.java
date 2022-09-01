package step03_loop;

import java.util.Scanner;

// BaekJoon 문제 10951번
// 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
//예제 입력1 		예제 출력1
//26			4
//55			3
//1				60
//0				1
//71			12

public class Lv13_SumCycle {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int n1 = input % 10; // 1의자리
		int n10 = (input % 100 - n1) / 10; // 10의자리
		int sum = n1 + n10;
		int count = 1;

		while (true) {
			sum = (n1 * 10) + (sum % 10); // 1의자리값 + 오른쪽결과값 나머지 = 68
			if (sum == input) {
				System.out.println(count);
				break;
			}
			n1 = sum % 10; // n1을 갱신: 68을 10으로 나눈 나머지 = 8
			n10 = ((sum % 100) - n1) / 10; // n10을 재갱신 = 6(0)
			sum = n1 + n10;
			count++;
		}
	}
}
