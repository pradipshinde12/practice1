package array_program;

public class frequency_of_each {
	public static void main(String args[])
	{
		 int a[]= {1,2,3,4,3,4,1,1,1};
		 
		 for( int i=0; i<a.length; i++)
		 {
			 int cn=a[i];
			 int count=1;
			 if(cn==-1)
			 {
				 continue;
			 }
			 for(int j=i+1; j<a.length; j++)
			 {
				 if(a[j]==cn)
				 {
					 count++;
					 a[j]=-1;
				 }
			 }
		 
			 System.out.println(" the frequincy of "+ cn+" each element is"+ count);
		 }	 
	}
}

