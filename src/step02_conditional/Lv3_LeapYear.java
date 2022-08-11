package step02_conditional;

import java.util.Scanner;

// 	BaekJoon 문제 9498번 
// 	연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
// 	윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
// 	예제 입력1 		예제 출력1
// 	2000			1
//	예제 입력1 		예제 출력1
//	1999			0

public class Lv3_LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if ((a % 4 == 0) && a % 100 != 0 || a % 400 == 0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
