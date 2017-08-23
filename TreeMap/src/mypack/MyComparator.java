package mypack;

import java.util.Comparator;

public class MyComparator implements Comparator<Myclass> {

	@Override
	public int compare(Myclass o1, Myclass o2) {
		return o1.getA() - o2.getA();
	}

}
