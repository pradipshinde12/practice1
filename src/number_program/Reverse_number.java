package number_program;

import java.util.*;
public class Reverse_number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number ");
		int a =sc.nextInt();
		 int rev=0;
		while(a>0)
		{
			int rem=a%10;
			 rev=rev*10+rem;
			 a=a/10;
			
		}
		System.out.println(" the reverse number is "+rev);
	}

}
