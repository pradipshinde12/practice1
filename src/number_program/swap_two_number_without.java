package number_program;

public class swap_two_number_without 
{
	public static void main(String args[])
	{
		 int n1=10;
		  int n2=23;
		  System.out.println(" before swapping "+ n1 +" " +n2);
		  
		  n1=n1+n2;
		  n2=n1-n2; 
		  n1=n1-n2;
		  
		  System.out.println( " after swaping "+n1 + " " +n2);
	}

}
