import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("a.txt");
		if(!f.exists()){
			System.out.println("File not found");
			System.exit(0);
		}
		try (FileInputStream fis = new FileInputStream(f)){
			byte b[] = new byte[(int)f.length()];
			fis.read(b);
			try (FileOutputStream fos = new FileOutputStream("b.txt")){
				fos.write(b);
				System.out.println("Done copying in b.txt!");
			} catch (IOException e) {
				// TODO: handle exception
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
