//to find the value in the given matrix 
import java.util.*;

public class FindValueInMatrix
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter row value: ");
	    int r = sc.nextInt();
	    System.out.println("Enter col value: ");
	    int c  = sc.nextInt();
	    
		int x[][] = new int[r][c];
		for(int i=0; i<r; i++)
		{
		    for(int j=0; j<c; j++)
		    {
		        x[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("Enter the value to be found: ");
		int num = sc.nextInt();
		
		for(int i =0; i<r; i++)
		{
		    for(int j=0; j<c; j++)
		    {
		        if(x[i][j] == num) //to compare the value with given matrix
		        {
		            System.out.println("The Value is found at (" + i + "," + j + ")");
		        }
		    }
		}
		System.out.println("The Value is not found in given matrix");
		
	}
}
