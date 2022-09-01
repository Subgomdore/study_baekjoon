package step04_Array;

import java.util.Scanner;

//BaekJoon 문제 10818번
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//예제 입력1 			예제 출력1
//5					7 35
//20 10 35 30 7

public class Lv1_MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] array = new int[num];

		for (int r = 0; r < num; r++) {
			array[r] = sc.nextInt();
		}

		int max = array[0];
		int min = array[0];

		for (int i = 0; i < num; i++) {
			max = (array[i] > max) ? array[i] : max;
			min = (array[i] < min) ? array[i] : min;
		}
		System.out.println(min);
		System.out.println(max);
	}

}
