package step03_loop;

import java.util.Scanner;

// BaekJoon 문제 11022번
// 두 정수 A와 B를 입력받은 다음, 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다
//예제 입력1 		예제 출력1
//5
//1 1				Case #1: 1 + 1 = 2
//2 3				Case #2: 2 + 3 = 5
//3 4				Case #2: 2 + 3 = 5
//9 8				Case #4: 9 + 8 = 17
//5 2				Case #5: 5 + 2 = 7

public class Lv7_SumCase2 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		for (int i = 1; i < n + 1; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
		}
	}
}
