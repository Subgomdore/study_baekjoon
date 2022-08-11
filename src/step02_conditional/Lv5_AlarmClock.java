package step02_conditional;

import java.util.Scanner;

// BaekJoon 문제 2884번 
// 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
// 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
// 예제 입력1 		예제 출력1
// 10 10		9 25
// 예제 입력2 		예제 출력2
// 0 30			23 45
// 예제 입력3 		예제 출력3
// 23 40		22 55

public class Lv5_AlarmClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a >= 0 && a <= 23) && (b >= 0 && b <= 59))
			if (b - 45 < 0 && a - 1 >= 0)
				System.out.println((a - 1) + " " + (b + 60 - 45));
		if (b - 45 < 0 && a - 1 < 0)
			System.out.println((a + 23) + " " + (b + 60 - 45));
		if (b - 45 >= 0) // && a-1>=0)
			System.out.println((a) + " " + (b - 45));
	}
}
