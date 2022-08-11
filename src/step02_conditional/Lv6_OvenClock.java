package step02_conditional;

import java.util.Scanner;

// BaekJoon 문제 2884번 
// 첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
// 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 

// 예제 입력1		예제 출력1
// 14 30		14 50
// 20		
// 예제 입력2 		예제 출력2
// 17 40		19 0
// 80
// 예제 입력3 		예제 출력3
// 23 48		0 13
// 25

public class Lv6_OvenClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt(); // 시간
		int minute = sc.nextInt(); // 분
		int work = sc.nextInt();// 조리시간
		int overwork = (minute + work) / 60; // 현재 시각 분+조리시간을 60으로나눔(몇시간인지)

		if ((hour >= 0 && hour < 24) && (minute >= 0 && minute <= 59))
			if (overwork > 0 && minute + work > 59) // 조리시간이 1시간이상이고, 분+조리시간이 60이상일경우
			{

				if (hour + overwork < 24) {
					hour = hour + overwork;
					minute = (minute + work) % 60;
					System.out.println(+hour + " " + minute);
				} else if (hour + overwork > 23) {
					hour = hour + overwork - 24;
					minute = (minute + work) % 60;
					System.out.println(+hour + " " + minute);
				}
			} else if (overwork < 60) // 현재시각이 23이하 + 60분 이하일때
			{
				hour = hour;
				minute = minute + work;
				System.out.println(+hour + " " + minute);
				if (hour + overwork > 23) {
					hour = hour - 24;
					minute = minute + work;
					System.out.println(+hour + " " + minute);
				}
				
			}
	}
}
