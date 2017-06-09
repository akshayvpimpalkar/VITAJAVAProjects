import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("aa.txt");
		if(!f.exists()){
			System.out.println("File not found!!");
			System.exit(0);
		}
		
		try (FileReader fr = new FileReader(f)){
			char d[] = new char[(int)f.length()];
			fr.read(d);
			try (FileWriter fw = new FileWriter("bb.txt")){
				fw.write(d);
				System.out.println("Done copying from aa.txt to bb.txt"
						+ " using Unicode char stream");
			} catch (IOException e) {
				// TODO: handle exception
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
