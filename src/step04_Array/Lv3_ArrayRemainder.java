package step04_Array;

import java.util.Scanner;
import java.util.TreeSet;

// BaekJoon 문제 3052번
// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
// 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

////예제 입력1 			예제 출력1
//1					10
//2
//3
//4
//5
//6
//7
//8
//9
//10

public class Lv3_ArrayRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nanugi = 42;
		int value = 0;
		int count = 0;

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		TreeSet ts = new TreeSet();
		for (int k=0; k<10 ; k++)
		{
			value = array[k]%42;
			ts.add(value);

		}
		System.out.println(ts.size());
	}
}