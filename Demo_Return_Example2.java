import java.util.*;

public class Demo_Return_Example2 {
	
	static int Sum(int num1, int num2)
	{
		return num1+num2;
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int res1 = Demo_Return_Example2.Sum(n1,n2);
		System.out.println(res1);

	}

}
