package warmup1;

public class Diff21C 
{
	public int diff21(int n) 
	{
		  if(n<=21)
		  return (21-n);
		  return (n-21) *2;
	}

	public static void main(String[] args) 
	{
		Diff21C s = new Diff21C();
		
		System.out.println(s.diff21(21));


	}

}
