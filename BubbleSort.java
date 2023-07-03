import java.io.*;

public class BubbleSort {
	
	public static void main (String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of elements in array: ");
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the element: ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int limit = n-1;
		boolean flag = false;
		int temp;
		for(int i=0; i<limit; i++)
		{
			for(int j=0; j<limit-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false)
				break;
		}
		
		System.out.println("The Sorted array is : ");
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}
