import java.io.*;

public class Example_Stars {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of rows to print triangle 1 : ");
		int rows1 = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=rows1; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" * "); 
			}
			System.out.println();
		}
		
		System.out.println("Enter the no of row to print triangle 2 : ");
		int rows2 = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=rows2; i++)
		{
			for(int j=rows2; j>=i; j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		

	}

}
