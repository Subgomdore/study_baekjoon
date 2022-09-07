package step06_String;

import java.util.Scanner;

public class Lv1_ASCII {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] chr = str.toCharArray();
		int n = chr[0];
		System.out.println(n);
	}
}
