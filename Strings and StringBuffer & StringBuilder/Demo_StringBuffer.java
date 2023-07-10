package String_Buffer;
import java.io.*;

public class Demo_StringBuffer {

	public static void main(String[] args) throws IOException
	{
		StringBuffer sb = new StringBuffer();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter the string 1: ");
		String str1 = br.readLine();
		System.out.println("Enter the string 2: ");
		String str2 = br.readLine();
		
		//sb.append(x) - x may be boolean, int, long, char, double, float,byte or another string it will be added to the string buffer object
		sb.append(str1);
		sb.append(str2);
		sb.append(10); //here int value is added to the string
		System.out.println("The String after appending the values: ");
		System.out.println(sb);
		
		//sb.insert(int i, x) - x may be boolean, int, long, char, double, float,byte or another string, it will be inserted to the bufferstring at the position represented by i.
		System.out.println("Enter the string 3: ");
		String str3 = br.readLine();
		System.out.println("The string after inserting the values: ");
		sb.insert(0, str3);
		System.out.println(sb);
		
		//sb.delete(int i, int j) - this removes the characters from the ith position to j-1th position
		System.out.println("The string after deleting the characters: ");
		sb.delete(0, 4);
		System.out.println(sb);
		sb.delete(14, 15);
		System.out.println(sb);
		
		//sb.reverse() - this method reverses the character sequence in the string buffer
		System.out.println("The reverse of the string : " + "\n" + sb.reverse());
		
		//sb.length() - this method returns the no of characters in the stringbuffer
		System.out.println("The length of the string: " + "\n" + sb.length());
		
		//int indexOf(String str) - this method returns the first occurrence of substring in the string buffer
		sb.reverse();
		int n1 = sb.indexOf("bhavani");
		System.out.println("The index value of 'vani' in the stringbuffer : " + n1);
		
		//int lastIndexOf(String str) - this method returns the last occurrence of substring in the string buffer
		int n2 = sb.lastIndexOf("a");
		System.out.println("The last index value of 'str' in the stringbuffer : " + n2);
		
		//sb.replace(int i, int j, String str) - this replaces the characters from i to j-1, by the string str in the string buffer object.
		sb.replace(0,4, str3);
		System.out.println("The replace of the str3 in the stringbuffer : " + sb);
		
		//String substring(int i) - this retrieves a sub string from the string buffer object starting from ith position till the end.
		String s1 = sb.substring(4);
		System.out.println("The extracted string is : " + s1);
		
		//String substring(int i) - this retrieves a sub string from the string buffer object starting from ith position to the j-1th position.
		String s2 = sb.substring(0, 3);
		System.out.println("The extracted string is : " + s2);
		
		//String toString() - this method converts the stringbuffer object into a string object. then string methods can be performed on this stringbuffer object
		String s3 = sb.toString();
		System.out.println("The stringbuffer is converted into string : " + s3);
		
	}

}
