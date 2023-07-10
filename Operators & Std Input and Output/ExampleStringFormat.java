//Getting formatted output using String.Format()

import java.util.*; 

public class ExampleStringFormat
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine(); 
		int n = sc.nextInt();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		char ch = sc.next().charAt(0);
		
		String str2 = String.format("str=%s %n n=%d %n f=%f %n d=%.2f %n ch=%c", str,n,f,d,ch);
		System.out.println(str2);
	}
}
