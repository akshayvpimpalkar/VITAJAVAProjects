import devpack.MyClass1;

/**
 * 
 */

/**
 * @author Akshay-VITA
 *
 */
public class ClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 m = new MyClass1(100);
		System.out.println(m.getNum());
		MyClass1 m1 = new MyClass1();
		m1.setNum(200);
		System.out.println(m1.getNum());
		System.out.println(m);
	}

}
