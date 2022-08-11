package step01_inputoutput;

import java.util.Scanner;

// 	BaekJoon 문제 1008번 
// 	두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
// 	예제 입력1 		예제 출력1
//	1 3 			0.33333333333333333333333333333333
//	4 5 			0.8
public class InputDivision {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		System.out.println(a / b);
	}
}