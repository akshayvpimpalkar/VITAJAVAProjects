import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {
		List<MyClass1> mylist = new ArrayList<MyClass1>();
//		MyClass1 arr[] = new MyClass1[5];
		mylist.add(new MyClass1(10));
		mylist.add(new MyClass1(20));
		mylist.add(new MyClass1(30));
		mylist.add(new MyClass1(40));
		mylist.add(new MyClass1(50));
		
		try (FileOutputStream fos = new FileOutputStream("abc.txt")){
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(mylist);
				System.out.println("writing done!");
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

class MyClass1 implements Serializable{
	int num;

	/**
	 * @param num
	 */
	public MyClass1(int num) {
		super();
		this.num = num;
	}
	
	
}
