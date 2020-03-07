//problem link - https://codingbat.com/prob/p187868
//HNG
package warmup1;

public class SleepIn 
{
	public boolean sleepIn(boolean weekday, boolean vacation) 
	{
	  return(!weekday || vacation);
	}

	public static void main(String[] args) 
	{
		SleepIn s = new SleepIn();
		
		System.out.println(s.sleepIn(false, true));


	}

}
