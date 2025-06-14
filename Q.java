//Pattern Q
/*
Enter number of rows:
5
Enter number of columns:
5
* * * * *
* *     *
*   *   *
* * * * *
        *

*/
import java.util.*;
public class Q
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row=sc.nextInt();
		System.out.println("Enter number of columns: ");
		int col=sc.nextInt();
		
		for(int i=1;i<=row+1;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1||(j==1&&(i<=row-1))||i==row-1||(j==col&&(i<=row-1))||(j>=(col/2)&&(i==j)))
				{
				    System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}