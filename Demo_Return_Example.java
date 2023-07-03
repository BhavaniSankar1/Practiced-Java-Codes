//program to demonstrate that the return statement in main() method terminates the application
public class Demo_Return_Example {

	public static void main(String[] args) {
		int x=1;
		System.out.println("Before return");
		if(x==1)
			System.exit(0); //terminates the application,we can also use return statement,0 represent normal termination, 1 represent termination because some error encountered
		System.out.println("After return");

	}

}
