package step02_conditional;

import java.util.Scanner;

//BaekJoon 문제 1330번 
//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//예제 입력1 		예제 출력1
//1 2			<
//10 2			>
//5 5			==

public class Lv1_CompareNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b)
			System.out.println(">");
		if (a < b)
			System.out.println("<");
		if (a == b)
			System.out.println("==");
	}
}
