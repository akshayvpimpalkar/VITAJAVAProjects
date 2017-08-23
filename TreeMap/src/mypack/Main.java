package mypack;

//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args){
		String s = "Pimpalkar";
		String s1 = s.substring(2, 4);
		System.out.println(s1);
		//Map<Integer, String> hm = new HashMap<>();
		//we are not providing any parameter to TreeMap constructor here
		Map<Myclass, String> tm = new TreeMap<>();
		Myclass m3 = new Myclass(45, "Akshay");
		Myclass m1 = new Myclass(10, "Kehshav");
		Myclass m2 = new Myclass(20, "Aditya");
		Myclass m4 = new Myclass(15, "Priyanka");
		
		//At the time of put method is called,
		//it internally calls CompareTo method of Comparable Interface
		//provided all the keys implemented the interface
		//so there will be default ordering strategy
		tm.put(m3, "m3String");
		tm.put(m1, "m1String");
		tm.put(m2, "m2String");
		tm.put(m4, "m4String");
		System.out.println(tm);
		
		
		//here we are providing instance of Comparator implementation
		//so that it will order based on the interface's compare method
		Map<Myclass, String> tm2 = new TreeMap<>(new SortByName());
		tm2.put(m3, "m3String");
		tm2.put(m1, "m1String");
		tm2.put(m2, "m2String");
		tm2.put(m4, "m4String");
		System.out.println("\n"+tm2);
	}
}
