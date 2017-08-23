package mypack;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.setCustName("Keshav");
		c.setCustID("465");
		c.setAddress("Pune");
		c.setAge(23);
		try (FileOutputStream fos = new FileOutputStream("xyz.txt")){
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(c);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("xyz.txt")){
			try (ObjectInputStream ois = new ObjectInputStream(fis)){
				Customer c1 = (Customer) ois.readObject();
				
				System.out.println(c1.getCustID()+" "+c1.getCustName() +" "+c1.getAge()+" "+c1.getAddress());
				System.out.println("Finished!");
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
