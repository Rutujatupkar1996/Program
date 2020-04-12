package rutuja;

public class TriPattern {
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)// outer loop for number of rows
		{
			for(int j=5;j>=i;j--)// inner loop for number of columns
			{
				System.out.print(" ");// print space
			}
	                   for(int k=1;k<=i;k++)// used for printing star
	           {
		System.out.print(" *");// print star
	           }
	      System.out.println();//ending line after each row
		}
	}
	
}

