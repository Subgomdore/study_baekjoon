package step03_loop;

import java.util.Scanner;

//BaekJoon 문제 2739번 
//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
//예제 입력1 		예제 출력1
//2			    2 * 1 = 2
//				2 * 2 = 4
//				2 * 3 = 6
//				2 * 4 = 8
//				2 * 5 = 10
//				2 * 6 = 12
//				2 * 7 = 14
//				2 * 8 = 16
//				2 * 9 = 18

public class Lv1_MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;  			// 구구단을 실행할 변수선언
		num = sc.nextInt(); // 입력받을 구구단

		for (int r = 1; r <= 9; r++)
			System.out.println(num + " * " + r + " = " + num * r);
	}

}
