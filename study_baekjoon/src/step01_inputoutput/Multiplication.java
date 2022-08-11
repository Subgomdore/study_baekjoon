package step01_inputoutput;

import java.util.Scanner;

// 	BaekJoon 문제 10430번 
// 	세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
// 	예제 입력1 		예제 출력1
//	472				2360
//	385				3776
//					1416
//					181720

public class Multiplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A * (B % 10));
		System.out.println(A * ((B % 100) / 10));
		System.out.println(A * ((B % 1000) / 100));
		System.out.println(A * B);
	}
}