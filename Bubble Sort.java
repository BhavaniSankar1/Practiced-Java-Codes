import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of elements: ");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
		    System.out.println("Enter the elements: ");
		    arr[i] = Integer.parseInt(br.readLine());
		}
		
		int limit = n-1; //the no of passes is n-1 therefore if n=5 then n-1=4
		int temp;
		boolean flag = false; //intialise the boolean value to false 
		
		for(int i=0; i<limit; i++) //outerloop used for iterating the no of passes
		{
		    for(int j=0; j<limit-i; j++) //inner loop used for comparing
		    {
		        if(arr[j]>arr[j+1]) //the previous value in the array is compared
		        {
		            temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		            flag = true;  // true if swapping is done
		        }
		    }
		    if (flag == false) //breaks the loop if swapping is not done 
		        break;
		}
		
		System.out.println("The Sorted array is: ");
		
		for(int i=0; i<n; i++)
		{
		    System.out.println(arr[i]);
		}
		
		
	}
}
