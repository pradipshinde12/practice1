package number_program;

public class Largest_of_three {
	public static void main(String args[])
	{
		 int n1=12,  n2=23,  n3=45;
		 
		 if((n1>n2)&& (n1>n3))
		 {
			System.out.println(" n1 is  the largest "+ n1); 
		 }
		 else if(n2>n1&&n2>n3)
		 {
			 System.out.println(" n2 is the largest number "+n2);
		 }
		 else
		 {
			 System.out.println(" n3 is the largest");
		 }
	}

}
