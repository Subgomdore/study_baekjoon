package step03_loop;

import java.util.Scanner;

//BaekJoon 문제 8393번 
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//1부터 n까지 합을 출력한다.

//예제 입력1 		예제 출력1
//3				6

public class Lv3_RangeOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 입력받은 n 값까지 합을 더함
		int sum = 0; // 합을 구하기위해 0으로 초기화

		for (int i = n; i > 0; i--) // n값부터 0까지 합을구하는 루프문
		{
			sum = sum + i; // sum 값은 0부터 연산된결과를 기존값과 합산해서 변수값을 변경함
		}
		System.out.println(sum);
	}
}
