import java.util.Scanner;

public class MyCalcApp {

	 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int n = sc.nextInt();
		
		
		
		Calculator c = new Calculator();
		try {
			System.out.println(c.calDouble(n));
		} catch (MyArithException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
