package step03_loop;

import java.util.Scanner;

// BaekJoon 문제 2438번
// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//예제 입력1 		예제 출력1
//5
				//*
				//**
				//***
				//****
				//*****

public class Lv9_StarPrint2 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int r = 0; r < i + 1; r++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
