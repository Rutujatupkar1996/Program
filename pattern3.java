package rutuja;
public class PascalTri {
	
	public static void main(String[] args)
	{
		int rows =5, coef= 1;
		
		for(int i=0;i<5;i++)//loop for rows
		{
			for(int k =1;k<5-i;k++)// loop for spaces
			{
				System.out.print(" ");
			}
		for(int j=0;j<=i;j++)// loop for printing elements
			{
				if(j==0 || i==0 )
					coef = 1;
				else
					coef = coef * (i-j+1)/j;
				System.out.printf("%4d", coef);// use for space formatting
			}
		System.out.println();
		}
	}
}
		
		
		
		
