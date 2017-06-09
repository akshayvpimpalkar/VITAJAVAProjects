/**
 * 
 */
package devpack;

/**
 * @author Akshay-VITA
 *
 */
public class MyClass1 {
	/**
	 * 
	 */
	public MyClass1() {
		super();
	}

	/**
	 * @param num
	 */
	public MyClass1(int num) {
		super();
		this.num = num;
	}

	int num;

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am in MyClass1 and overrided toString";
	}
}
