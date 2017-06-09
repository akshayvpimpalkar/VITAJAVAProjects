import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (RandomAccessFile raf = new RandomAccessFile("abc.txt", "rw")){
			raf.seek(raf.length());
			System.out.println("Enter data");
			byte b[] = new byte[200];
			int k = System.in.read(b);
			raf.write(b, 0, k);
			raf.seek(0);
			byte c[] = new byte[(int)raf.length()];
			raf.read(c);
			String ss = new String(c);
			System.out.println(ss);
			//raf.seek(raf.length());
			System.out.println("\nenter data again");
			k = System.in.read(b);
			raf.write(b, 0, k);
			System.out.println("Reading all the data");
			raf.seek(0);
			c = new byte[(int)raf.length()];
			raf.read(c);
			ss = new String(c);
			System.out.println(ss);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
