
public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor m = new Monitor();
		
		Producer p = new Producer(m);
		Consumer c = new Consumer(m);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
	}

}
