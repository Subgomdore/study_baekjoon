package step04_Array;

import java.util.Scanner;

//BaekJoon 문제 1546번
//세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

//예제 입력1 			예제 출력1
//3
//40 80 60			75.0
//
//3
//10 20 30			66.666667

public class Lv4_ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		int min = 100, max = 0;
		double sum = 0;


		int array[] = new int[input];
		double result[] = new double[input];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}

		for (int r = 0; r < array.length; r++) {
			result[r] = (double) array[r] * 100 / max;
			sum += result[r];
		}

		System.out.println(sum / input);

	}

}
