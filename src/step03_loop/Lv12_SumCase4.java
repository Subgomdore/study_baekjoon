package step03_loop;

import java.util.Scanner;

// BaekJoon 문제 10951번
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//예제 입력1 		예제 출력1
//1 1			2
//2 3			5
//3 4			7
//9 8			17
//5 2			7

public class Lv12_SumCase4 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int value = sc.nextInt();
			int value2 = sc.nextInt();
			if (0 < value && value2 < 10)
				System.out.println(value + value2);
		}
	}
}
