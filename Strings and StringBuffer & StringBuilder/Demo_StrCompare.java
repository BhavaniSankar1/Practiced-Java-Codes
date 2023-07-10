
public class Demo_StrCompare {

	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = "hello";
		//here reference number of objects are compared, each object contains unique reference number
		if(s1==s2)
		{
			System.out.println("Both are same");
		}
		else 
		{
			System.out.println("Not same");
		}
		
		//this method compares the contents of the string 
		if(s1.equals(s2))
		{
			System.out.println("Both are same");
		}
		else 
		{
			System.out.println("Not same");
		}
		
		/* In this method the string object is created using = assignment operator
		 the string is stored in the string constant pool, when the new string is created
		 the same object is already available, jvm does not create new object simply create 
		 another reference variable to the same object. so both are same*/ 
		if(s1==s3)
		{
			System.out.println("Both are same");
		}
		else 
		{
			System.out.println("Not same");
		}
		
		//this method ignores the case sensitive
		if(s1.equalsIgnoreCase(s4))
		{
			System.out.println("Both are same");
		}
		else 
		{
			System.out.println("Not same");
		}
		
		/*this method is used to compare the strings to know which is bigger in dictionary
		 * order wise. if s5 equals to s6 it return 0, if s1>s2 it returns positive number
		 *if s1<s2 then it returns the negative number
		 */
		String s5 = "Box";
		String s6 = "Boy";
		int n1 = s5.compareTo(s6);
		System.out.println(n1);
		
		String s7 = "Raju";
		String s8 = "ram";
		int n2 = s7.compareToIgnoreCase(s8);
		System.out.println(n2);
		
	}

}
