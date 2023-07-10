import java.io.*;
import java.util.*;
public class Matrix_Transpose {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rows, cols;
		System.out.println("Enter the rows and cols : ");
		rows = sc.nextInt();
		cols = sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The matrix is :");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The Transpose of the given matrix: "); 
		//Take cols as rows and rows as cols
		for(int i=0; i<cols; i++)
		{
			for(int j=0; j<rows; j++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();		

	}

}
