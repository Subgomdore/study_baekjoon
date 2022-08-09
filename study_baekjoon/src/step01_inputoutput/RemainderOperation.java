package step01_inputoutput;

import java.util.Scanner;

// 	BaekJoon 문제 10430번 
// 	세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
// 	예제 입력1 		예제 출력1
//	5 8 4			1
//					1
//					0
//					0

public class RemainderOperation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}
}