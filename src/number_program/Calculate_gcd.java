package number_program;

import java.util.*;
public class Calculate_gcd 
{
	public static void main(String args[])
	{
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println( " Enter a firsr number ");
		 int n1=sc.nextInt();
		 
		 System.out.println(" enter second number");
		 int n2=sc.nextInt();
		 
		 
		 int gcd=1;
		 
		 for(int i=1; i<n1&& i<n2; i++)
		 {
			 if(n1%i==0&&n2%i==0)
			 {
				 gcd=i;
			 }
	}
		 System.out.println( " the comman divisor is the "+gcd);
	}

}
