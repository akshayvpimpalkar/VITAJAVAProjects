//class Th1 extends Thread{
//
//	/* (non-Javadoc)
//	 * @see java.lang.Thread#run()
//	 */
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for(char i = 'A'; i <= 'J'; i++){
//			System.out.println(i+" ");
//		}
//	}
//	
//	
//}

class Th1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char i = 'A'; i <= 'J'; i++){
			System.out.println(i+" ");
		}
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Th1 t1 = new Th1();
		//Th1 t2 = new Th1();
		Thread t = new Thread(t1);
		Thread t2 = new Thread(t1);
		t.start();
		t2.start();
	}

}
