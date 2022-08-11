package step01_inputoutput;

import java.util.Scanner;

//	BaekJoon 문제 10869번 
//	두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
//	예제 입력1 		예제 출력1
//	7 3				10	(+)
//					4	(-)
//					21	(x)
//					2	(/)
//					1	(%)

public class ArithmeticOperation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int value1, value2, value3, value4, value5;
		value1 = a + b;
		value2 = a - b;
		value3 = a * b;
		value4 = a / b;
		value5 = a % b;
		System.out.println(value1); // System.out.println(a+b);
		System.out.println(value2); // System.out.println(a-b);
		System.out.println(value3); // System.out.println(a*);
		System.out.println(value4); // System.out.println(a/b);
		System.out.println(value5); // System.out.println(a%b);
	}
}
