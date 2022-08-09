package step02_conditional;

import java.util.Scanner;

// BaekJoon 문제 14681번 
// 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
// 예제 입력1 		예제 출력1
// 12			1
// 5
// 예제 입력1 		예제 출력1
// 9			4
// -13

public class Lv4_PickQuadrant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > 0 && b > 0)
			System.out.println("1");
		if (a < 0 && b > 0)
			System.out.println("2");
		if (a < 0 && b < 0)
			System.out.println("3");
		if (a > 0 && b < 0)
			System.out.println("4");
	}
}
