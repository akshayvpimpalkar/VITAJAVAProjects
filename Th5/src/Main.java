class Th1 implements Runnable{

	@Override
	 synchronized public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i <= 50; i++){
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Th2 implements Runnable{

	@Override
	 synchronized public void run() {
		// TODO Auto-generated method stub
		for(int i = 50; i >= 0; i--){
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Th1 th1 = new Th1();
		Th1 temp = new Th1();
		Th2 th2 = new Th2();
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(temp);
		
		t1.start();
		t2.start();
	}

}
