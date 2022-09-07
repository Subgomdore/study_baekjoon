package step05_function;

import java.util.Scanner;

//BaekJoon 문제 1065번
// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

////예제 입력1 			예제 출력1
//110 					99
//1						1
//210					105
//1000					144
//500					119


public class Lv3_Function {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= value; i++) {
			int han1 = i % 10; // 1의자리
			int han10 = (i % 100) / 10; // 10의자리
			int han100 = (i % 1000) / 100; // 100의자리
			int han1000 = (i % 10000) / 1000; // 1000의자리

			if (i < 100) {
				count++;
			}
			if (i >= 100 && i < 1000) {
				if (han100 - han10 == han10 - han1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}