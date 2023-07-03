
public class Demo_For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		System.out.println("**************XXX**************");
		char arr1[] = {'b', 'h','a','v','a','n','i'};
		for(char ch : arr1)
		{
			System.out.println(ch);
		}
		
		System.out.println("**************XXX**************");
		
		String str[] = {"bhavani", "vyshnavi", "Meghana", "nithin", "Lakshmi"};
		for(String s : str)
		{
			System.out.println(s);
		}

	}

}
