
public class Demo_Increment_Decrement {

	public static void main(String[] args) {
		int x = 1;		
		System.out.println(x++); //x=x+1 first displays the value and then increments the value
		System.out.println(x);
		System.out.println(++x); //x+1=x first increments the value and then displays the value
		System.out.println(x);
		
		System.out.println("---------xxx--------");
		int y = 1;
		System.out.println(y--);  // y=y-1 first displays the value and then decrement the value
		System.out.println(y);
		System.out.println(--y);  // y-1=y first decrements the value and then display the value
		System.out.println(y);

	}

}
