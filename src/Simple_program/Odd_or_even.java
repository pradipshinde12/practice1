package Simple_program;

import  java.util.*;
public class Odd_or_even {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" enter a number ");
		
		int n1=sc.nextInt();
		
		if(n1%2==0)
		{
			System.out.println(" the number is even");
		}
		else
		{
			System.out.println(" the number is odd");
		}
	}
	

}
