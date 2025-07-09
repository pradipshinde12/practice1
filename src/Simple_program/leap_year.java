package Simple_program;

import java.util.*;

public class leap_year {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a year ");
		int year = sc.nextInt();

		if(year%4==0)
		{
			System.out.println(" the given number is leap year");
		}
		else
		{
			System.out.println(" the given number is not a leap year");
		}
	}
}
