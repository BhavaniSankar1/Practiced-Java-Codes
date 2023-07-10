//Displaying 2D array as a matrix
import java.util.*;

public class Array 
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		int x[][] = new int[3][4];
		for(int i=0; i<3; i++)
		{
		    for(int j=0; j<4; j++)
		    {
		        x[i][j] = sc.nextInt();
		    }
		}
		for(int i =0; i<3; i++)
		{
		    for(int j=0; j<4; j++)
		    {
		        System.out.print(x[i][j] + " ");
		    }
		    System.out.println();
		}
		
	}
}
