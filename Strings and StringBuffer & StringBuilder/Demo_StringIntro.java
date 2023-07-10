import java.util.Scanner;
import java.lang.*;

public class Demo_StringIntro{

	public static void main(String[] args) 
	{
		//three types of declaration of arrays
		
		String str1 = "hello";
		String str2 = new String("I am Bhavani Sankar");
		char arr[] = {'R', 'm', 'k', 'c','e','t'};
		String str3 = new String(arr);
		String str4 = new String(arr, 2, 3); //2 is starting position and 3 is no.of characters to be printed from position 2
		
		System.out.println("String 1 :" + str1);
		System.out.println("String 2 :" + str2);
		System.out.println("String 3 :" + str3);
		System.out.println(str2 + " from " + str3);
		System.out.println("String 4 :" + str4);
		
		String str5 = str1.concat(str2);   //join the two strings
		System.out.println("Concatination of strings: " + str5);
		System.out.println("Length of the string5: " + str5.length());    //returns no of characters in the string
		System.out.println("Character at the position i: " + str5.charAt(5));  //returns the character at specific location i
		
		// this method returns true if the string s1 starts with s2, otherwise returns false. s2 is the substring of s1
		String s1 = "Hello I am bhavani";
		String s2 = "Hello";
		boolean s = s1.startsWith(s2);
		System.out.println(s);
		
		//this method tests the ending of string, returns true if the string s1 ends with s2, otherwise false.
		boolean x = s1.endsWith(s2);
		System.out.println(x);
		
		//this method returns an integer value. If s1 contains s2 as a substring then the first occurrence of s2 in string s1 will be returned
		String s3 = "This is a book";
		String s4 = "is";
		int n1 = s3.indexOf(s4);
		System.out.println("The first Occurrence of s2 in s1: " + n1);
		
		//this method similar to preceding method, it returns the last occurrence of string s2 in s1
		int n2 = s3.lastIndexOf(s4);
		System.out.println("The last Occurrence of s2 in s1: " + n2);
		
		//this method is used to replace the characters in the string
		String str7 = str1.replace('l','x');
		System.out.println("The l character is replaced by x: " + str7);
		
		//this method is used to extract the substring from the given string from the position i
		String str8 = str2.substring(5);
		System.out.println("The extracted substring: " + str8);
		
		String str9 = str2.substring(5,12);
		System.out.println("The extracted substring: " + str9);
		
		// this method is used to convert the string into upper case
		System.out.println("To upper case: " + str2.toUpperCase());
		
		// this method is used to convert the string into lower case
		System.out.println("To lower case: " + str2.toLowerCase());
		
		//this method is used to remove the before and after space in the string
		String str10 = " Ravi Kumar ";
		System.out.println("Remove the before and after spaces of string: " +str10.trim());
		
		//this method copies character of string into char array. the characters starting from position i1 to i2-1. this are stored in char arr[] to the location starting from i3
		String str11 = "Hello, this is a book on java";
		char arr2[]= new char[20];
		str11.getChars(7,21, arr2, 0);
		System.out.println(arr2);
		
		//this method is used to break the string into pieces at a place represented by the delimiter. The resultant pieces are returned into a string type array
		String str12 = "Hello! My name is bhavani sankar, I am from Rmkcet.";
		String arr3[];
		
		arr3 = str12.split("[ !,?._'@]+");
		for(int i = 0; i<arr3.length; i++)
			System.out.println(arr3[i]); 
		
		
	} 
	

}
