import java.util.Scanner;

public class Main {

	static void perform(Vehicle ref){
		ref.start();
		if(ref instanceof TwoWheeler){
			((TwoWheeler) ref).disp();
		}
	}
	public static void main(String[] args) {
		Vehicle v = new FourWheeler();
		
		perform(v);
		perform(new TwoWheeler());
		perform(new ThreeWheeler());
		
	}

}
