package number_program;

import java.util.*;
public class SUm_of_Digit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println(sum);
		
	}

}
