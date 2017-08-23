package mypack;

import java.util.Comparator;

public class SortByName implements Comparator<Myclass> {

	@Override
	public int compare(Myclass o1, Myclass o2) {
	
		return o1.getName().compareTo(o2.getName());
	}

}
