package step03_loop;

import java.util.Scanner;

//BaekJoon 문제 10950번 
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

//예제 입력1 		예제 출력1
//5						
//1 1			2
//2 3			5
//3 4			7
//9 8			17
//5 2			7

public class Lv2_TestCaseOpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 케이스(반복회수 입력)

		for (int i = t; i > 0; i--) {
			int num1 = sc.nextInt(); // 연산할 데이터 A
			int num2 = sc.nextInt(); // 연산할 데이터 B
			System.out.print(num1 + num2); // 연산값 출력
			System.out.println(); // 줄바꿈
		}
	}

}