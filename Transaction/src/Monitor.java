
public class Monitor {
	private int token=0;
	private boolean value_set=false;
	
	synchronized public void set(int k){
		
		while(value_set){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		token=k;
		System.out.println("Set "+ token);
		value_set = true;
		notifyAll();
	}
	
	synchronized public void get(){
		
		while(!value_set){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		value_set = false;
		notifyAll();
		System.out.println("Get "+token);
	}
}
