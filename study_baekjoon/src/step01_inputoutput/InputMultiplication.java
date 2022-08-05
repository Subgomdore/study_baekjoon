package step01_inputoutput;

import java.util.Scanner;

// 	BaekJoon 문제 10998번 
// 	두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
// 	예제 입력1 		예제 출력1
//	1 2 			2
//	3 4				12

public class InputMultiplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * b);
	}
}