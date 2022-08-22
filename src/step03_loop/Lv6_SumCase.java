package step03_loop;

import java.util.Scanner;

// BaekJoon 문제 11021번
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//예제 입력1 		예제 출력1
//5
//1 1				Case #1: 2
//2 3				Case #2: 5
//3 4				Case #3: 7
//9 8				Case #4: 17
//5 2				Case #5: 7

public class Lv6_SumCase {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 
		for (int i = 1; i < n + 1; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Case #" + i + ": " + (num1 + num2));
		}
	}
}
