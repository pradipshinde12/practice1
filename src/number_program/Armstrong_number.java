package number_program;

import java.util.*;
public class Armstrong_number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" enter a number ");
		  int n=sc.nextInt();
		  
		  int org =n;
		   int sum=0;
		  while(n>0)
		  {
			  int r=n%10;
			  sum=sum+r*r*r;
			  n=n/10;
		  }
		  
		  if(org==sum)
		  {
			  System.out.println( " this is the armstrong number ");
		  }
		  else
		  {
			   System.out.println(" this is not the armstrong number ");
		  }
		 
	}

}
