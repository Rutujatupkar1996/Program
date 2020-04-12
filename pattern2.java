package rutuja;

public class Pattern2 {
	
	public static void main(String[] args)
	{
		// Printing upper half of the pattern 
		for(int i=1;i<=5;i++) // outer loop for number of rows
		{
			for(int j=1;j<=i;j++) // inner loop for number of columns
			{
				System.out.print("*"); // print star
			}
			System.out.println(); //ending line after each row
		}
		// Printing lower half of pattern
		for(int i=1;i<=5;i++) // inner loop for rows
		{
			for(int j=4;j>=i;j--) // outer loop for columns
			{
				System.out.print("*"); // print star
			}
			System.out.println(); //ending line after each rows
	}

}

}
