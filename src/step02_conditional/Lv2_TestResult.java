package step02_conditional;

import java.util.Scanner;

//BaekJoon 문제 9498번 
//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//예제 입력1 		예제 출력1
//100			A

public class Lv2_TestResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (90 <= a && a <= 100)
			System.out.println("A");
		if (80 <= a && a <= 89)
			System.out.println("B");
		if (70 <= a && a <= 79)
			System.out.println("C");
		if (60 <= a && a <= 69)
			System.out.println("D");
		if (60 > a)
			System.out.println("F");

	}

}
