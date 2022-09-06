package step05_function;

import java.util.Iterator;
import java.util.TreeSet;

public class Lv2_SelfNumber {
	public static void main(String args[]) {

		TreeSet ts = new TreeSet();
		TreeSet han = new TreeSet();

		for (int i = 1; i <= 10000; i++) {
			ts.add(i + (i % 10) + ((i % 100) / 10) + ((i % 1000) / 100) + ((i % 10000) / 1000)
					+ ((i % 100000) / 10000));
		}
		for (int i = 1; i <= 10000; i++) {
			han.add(i);
		}
		han.removeAll(ts);

		Iterator iter = han.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
