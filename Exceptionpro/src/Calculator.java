
public class Calculator {
	public int calDouble(int a) throws MyArithException{
		
		if(a == 0)
		{
			throw new MyArithException("0 not allowed");
		}else if(a < 0)
		{
			throw new MyArithException("Negative not allowed");
		}else
		{
			return a*2;
		}
		
		
	}
}
