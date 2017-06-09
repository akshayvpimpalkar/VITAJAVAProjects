abstract class Game{
	abstract void play();
} 

class Football extends Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("In Football play");
	}

	
}

class Cricket extends Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("In Cricket play");
	}
	
}

class Tennis extends Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("In Tennis play");
	}
	
}


public class GamesDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Game arr[] = new Game[3];
		arr[0] = new Football();
		arr[1] = new Cricket();
		arr[2] = new Tennis();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] instanceof Cricket)
			{
				arr[i].play();
			}
		}
		
	}

}
