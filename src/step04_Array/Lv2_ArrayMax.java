package step04_Array;

import java.util.Scanner;

//BaekJoon 문제 2562번
//9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//예제 입력1 			예제 출력1
//3					85
//29				8
//38
//12
//57
//74
//40
//85
//61

public class Lv2_ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = 9; // 배열의크기를 문제에서 지정함

		int[] array = new int[num];

		for (int r = 0; r < num; r++) {
			array[r] = sc.nextInt(); // 배열의 크기만큼 값을 입력받음
		}

		int max = array[0];
		int count = 0;

		for (int i = 0; i < num; i++) {
			if (max <= array[i]) {

				max = (array[i] > max) ? array[i] : max;
				count = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}

}
