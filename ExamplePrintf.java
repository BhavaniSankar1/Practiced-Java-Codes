//to understand the use of printf()

import java.util.*;

public class ExamplePrintf
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine(); 
		int n = sc.nextInt();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		char ch = sc.next().charAt(0);
		
		System.out.printf("String = %s %n Integer = %d %n Float = %f %n Double = %.2f %n Character = %c", 
		str,n,f,d,ch);  //%n is used to print new line 
		
		
	}
}
