//Total marks and percentage of a student

import java.io.*;

public class StudentMarks
{
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Enter the no of Subjects: ");
	    int n = Integer.parseInt(br.readLine());
	    
	    int marks[] = new int[n];
	    
	    for(int i=0; i<n; i++)
	    {
	        System.out.println("Enter marks: ");
	        marks[i] = Integer.parseInt(br.readLine());
	    }
	    
	    int total=0;
	    for(int i=0; i<n; i++)
	    {
	        total += marks[i];
	    }
	    System.out.println("Total : "+ total);
	    
	    float percent= (float)total/n;  //(float) is a cast operator
	    
	    System.out.println("Percentage :"+ percent);
	    
	}
}
