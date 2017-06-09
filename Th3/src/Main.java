class Th3 implements Runnable{

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 5; i++){
			System.out.println(i);
		}
	}
	
}

public class Main {
	public static void main(String args[]){
		Th3 t = new Th3();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();
		t2.start();
	}
}
