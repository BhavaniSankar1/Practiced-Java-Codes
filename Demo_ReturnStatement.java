//to generate the square value

import java.util.*;

public class Demo_ReturnStatement {

	static int myMethod(int num)  //this method calculates the square value and returns it to main()
	{
		return num*num;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		
		//calls myMethod and catch the result into res
		int res = Demo_ReturnStatement.myMethod(n);    //Since myMethod() is static we can call it using classname.methodname()
		
		System.out.println("The Square value is : " + res); //displays the result
	}

}
