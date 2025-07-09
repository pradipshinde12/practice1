package number_program;

import java.util.*;
public class palindrome_or_not {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number");
		
		int n=sc.nextInt();
		
		int org=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			 rev=rev*10+rem;
			n=n/10;
		}
		
		if(rev==org) {
			System.out.println(" this is the palindrome number ");
			
		}
		else
		{
			System.out.println(" this is not the palindrome number ");
		}
	}

}
