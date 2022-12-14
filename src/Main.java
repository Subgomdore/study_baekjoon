
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int cost = sc.nextInt(); // 계산한금액
		int tc = sc.nextInt(); // 테스트케이스 (항목이몇종류인가)
		int[][] array = new int[tc][2];
		for (int i = 0; i < tc; i++) {
			for (int k = 0; k < 2; k++) {
				int value = sc.nextInt();
				array[i][k] = value;
			}
		}
		
		int sum = 0;
		int lastsum = 0;
		for (int i = 0; i < tc; i++) {
			sum = array[i][0] * array[i][1];
			lastsum += sum;
		}

		if (cost == lastsum) {
			System.out.println("Yes");
		}

		else {
			System.out.println("No");
		}
	}
}
