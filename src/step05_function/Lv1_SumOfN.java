package step05_function;

//BaekJoon 문제 15596번
//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.


class SumOfN {
	long sum(int[] a) {
		long sum = 0; // a 배열 정수 합 변수

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}