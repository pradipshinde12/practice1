package number_program;

import java.util.*;
public class fibonacci_series 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 int n1=0,n2=1;
		 System.out.println(" enter a number ");
		 
		 int n=sc.nextInt();
		 System.out.println(n1 + "  "+n2);
		 
		 for(int i=0; i<n; i++)
		 {
			 int n3=n1+n2;
			 System.out.println(n3);
			 n1=n2;
			 n2=n3;
		 }
	}

}
