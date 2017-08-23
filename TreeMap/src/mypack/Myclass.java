package mypack;

public class Myclass implements Comparable<Myclass>{
	private int a;
	private String name;

	public Myclass(int a, String name) {
		super();
		this.a = a;
		this.name = name;
	}

	public String getName() {
		return name;
	}


	@Override
	public int compareTo(Myclass o) {
		return o.a - a;
	}

	public int getA() {
		return a;
	}


	@Override
	public String toString() {
		return "\nMyclass [a=" + a + ", name=" + name + "]";
	}
	
	
}
