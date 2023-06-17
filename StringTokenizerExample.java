//the program is used to accept the input from the user in the form of string using the StringTokenizer

import java.io.*;
import java.util.*;

public class StringTokenizerExample
{
	public static void main(String[] args) throws IOException  
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any two numbers: ");
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " "); //StringTokenizer used to accept the input in form of string
		
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		
		s1=s1.trim(); //s.trim() used to remove the spaces before and after of string
		s2=s2.trim();
		
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		
		System.out.println("Addition = "+ (n1+n2));
		System.out.println("Subtraction = "+ (n1-n2));
		System.out.println("Multiplication = "+ (n1*n2));
		System.out.println("Division = "+ (n1/n2));
		System.out.println("Modulo = "+ (n1%n2));
	}
}
