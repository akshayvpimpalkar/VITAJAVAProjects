import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileWriter fw = new FileWriter("x.txt")){
			System.out.println("Enter characters: ");
			char c[]= new char[10]; 
			for(int i = 0; i < c.length; i++){
				c[i] = sc.next().charAt(0);
			}
			fw.write(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char c1[]= new char[10];
		try (FileReader fr = new FileReader("x.txt")){
			fr.read(c1);
//			String ss = new String(c1);
			for(int i = 0; i < c1.length; i++){
				System.out.println(c1[i]);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
