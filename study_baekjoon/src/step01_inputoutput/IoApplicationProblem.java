package step01_inputoutput;

import java.util.Scanner;

//	BaekJoon 문제 10926번 
//	첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다. 아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.
//	예제 입력1 		예제 출력1
//	joonas 			joonas??!
//  baekjoon		baekjoon??!

public class IoApplicationProblem {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // String 값을 입력받고
		if (str.equals(str)) // 조건이 이미 존재하는 아이디라고주어져있으니. 입력받은 값과 비교값이 동일해야함
			System.out.println(str + "??!"); // 입력받은 문자열 + ??! 를 추가해서 출력해준다.
	}
}
