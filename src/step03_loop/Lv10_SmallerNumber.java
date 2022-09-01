package step03_loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// BaekJoon 문제 10871번
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//예제 입력1 					예제 출력1
//10 5
//1 10 4 9 2 3 8 5 7 6		1 4 2 3

public class Lv10_SmallerNumber {
	public static void main(String args[]) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine(); 
		bw.write(s);
	}
}
