package warmup1;

public class SumDoubleC 
{	
	public int sumDouble(int a, int b) {
		  if(a == b)
		  {
		    return(2*(a+b));
		  }
		    return(a+b);
		}

	public static void main(String[] args) 
	{
		SumDoubleC s = new SumDoubleC();
		
		System.out.println(s.sumDouble(2, 2));


	}

}
