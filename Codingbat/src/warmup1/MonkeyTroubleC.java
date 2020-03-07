package warmup1;

public class MonkeyTroubleC 
{
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) 
	{
	  return !(aSmile ^ bSmile);
	}

	public static void main(String[] args) 
	{
		MonkeyTroubleC s = new MonkeyTroubleC();
		
		System.out.println(s.monkeyTrouble(true, false));


	}

}
