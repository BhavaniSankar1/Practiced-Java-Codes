//java program to demonstrate that a method can return multiple values of same type by using an returning an array
import java.util.*;

public class Demo_Return_Example3 {
	
	static int[] methods(int a, int b)  //returns array such that first element of array is a+b and second element is a/b
	{
		int arr[] = new int[2];
		arr[0] = a*b;
		arr[1] = a/b;
		return arr;    //return array of elements
	}
	
	static int methods2(int a, int b) //another method used to for a-b
	{
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1%2 == 0 && n2%2 ==0)    //if condition used for checking whether the numbers is even or odd
		{
			int res[] = Demo_Return_Example3.methods(n1, n2);      //prints if both are even
			System.out.println("Mul :" + res[0] + "\t" + "Div: " + res[1]);
		}
		else
		{
			int res2 = Demo_Return_Example3.methods2(n1, n2);        //prints if both are odd
			System.out.println("Sub : " + res2);
		}
		
	}

}
