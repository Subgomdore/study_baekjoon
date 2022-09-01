package step04_Array;

import java.util.Scanner;

//BaekJoon 문제 4344번
//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
//예제 입력1 							예제 출력1
//5
//5 50 50 70 80 100					40.000%
//7 100 95 90 80 70 60 50				57.143%
//3 70 90 80							33.333%
//3 70 90 81							66.667%
//9 100 99 98 97 96 95 94 93 91		55.556%

public class Lv6_AboveAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int test_c = sc.nextInt();
		int[] score_array = null;
		int[] count_array = null;
		double[] last_avg = null;
		int count = 0;
		int sum = 0;
		int avg = 0;
		int people = 0;
		double per_avg = 0;
		last_avg = new double[test_c];

		for (int i = 0; i < test_c; i++) // 테스트케이스의 개수
		{
			count = 0;
			people = 0;
			avg = 0;
			sum = 0;
			people = sc.nextInt();
			score_array = new int[people];
			for (int r = 0; r < people; r++)// 한 케이스당 학생수 (몇명인지==입력할점수의 갯수)
			{
				int score = sc.nextInt();
				score_array[r] = score;
				sum += score_array[r];
				if (r == (people - 1)) {
					avg = sum / people;
				}
			}
			for (int k = 0; k < people; k++) {
				if (score_array[k] > avg) {
					count++;
				}
				count_array = new int[people];
				count_array[k] = count;

			}
			per_avg = (double) count / (double) people * 100;
			last_avg[i] = per_avg;
		}
		for (int y = 0; y < last_avg.length; y++)
			System.out.println(String.format("%.3f", last_avg[y]) + "%");
	}

}
