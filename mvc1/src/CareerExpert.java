
public class CareerExpert {
	
	String getAdvice(String quali)
	{
		if(quali.equalsIgnoreCase("BE"))
			return "Bachelor of Engg";
		else if(quali.equalsIgnoreCase("medical"))
			return "MBBS";
		else 
			return "other things";
		
	}
	
	

}
