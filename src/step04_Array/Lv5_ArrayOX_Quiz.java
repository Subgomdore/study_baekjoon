package step04_Array;

import java.util.Scanner;

//BaekJoon 문제 8958번
//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
//문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//예제 입력1 			예제 출력1
//5
//OOXXOXXOOO			10
//OOXXOOXXOO			9
//OXOXOXOXOXOXOX		7
//OOOOOOOOOO			55
//OOOOXOOOOXOOOOX		30

public class Lv5_ArrayOX_Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		sc.nextLine();
		int[] count = new int[80];
		int[] lastcount = new int[testcase];
		String[] ox;
		int cvl = 0;
		int sum = 0;
		for (int r = 0; r < testcase; r++) {
			String oxinput = sc.nextLine();
			ox = oxinput.split("");
			for (int i = 0; i < oxinput.length(); i++) {
				if (ox[i].equals("O") || ox[i].equals("o")) {
					cvl++;
					count[i] = cvl;
				}
				if (ox[i].equals("X") || ox[i].equals("x")) {
					cvl = 0;
					count[i] = cvl;
				}
				sum += count[i];
			}
			lastcount[r] = sum;
			sum = 0;
			cvl = 0;
		}
		for (int c = 0; c < lastcount.length; c++)
			System.out.println(lastcount[c]);
	}

}
