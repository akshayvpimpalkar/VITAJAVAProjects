import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter numbers till 0: ");
//		int n[]= new int[20];
//		sc.nextLine();
		int i=0;
			 
			try (FileOutputStream fos = new FileOutputStream("abc.txt")){
				try (DataOutputStream dos = new DataOutputStream(fos)){
//					do{
//						n[i] = sc.nextInt();
//						if(n[i] == 0){
//							break;
//						}
//						dos.writeInt(n[i]);
//					}while(n[i++]!=0);
					int n;
					do{
						n = sc.nextInt();
						dos.writeInt(n);
						if(n == 0){
							break;
						}
						
					}while(n != 0);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		System.out.println("\nreading file: ");
	
		try (FileInputStream fis = new FileInputStream("abc.txt")){
			try (DataInputStream dis = new DataInputStream(fis)){
				while(dis.available()>0){
					System.out.println(dis.readInt());
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
