package step03_loop;

import java.util.Scanner;

// BaekJoon 문제 10952번
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//예제 입력1 		예제 출력1
//1 1			2
//2 3			5
//3 4			7
//9 8			17
//5 2			7
//0 0

public class Lv11_SumCase3 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < i + 1; i++) {
			int value = sc.nextInt();
			int value2 = sc.nextInt();
			if (value == 0 && value2 == 0)
				break;
			System.out.println(value + value2);
		}
	}
}
