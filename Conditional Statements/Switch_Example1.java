//Switch statement to print the day 

import java.util.*;
public class Switch_Example1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the string: ");
	String str = sc.next();
	if (str.length() == 3)
	{
	switch(str)
	{
	case "sun" :
		System.out.println("Sunday");
		break;
	case "mon" :
		System.out.println("Monday");
		break;
	case "tue" :
		System.out.println("Tuesday");
		break;
	case "wed" :
		System.out.println("Wednesday");
		break;
	case "thu" :
		System.out.println("Thursday");
		break;
	case "fri" :
		System.out.println("Friday");
		break;
	case "sat" :
		System.out.println("Saturday");
		break;
	default :
		System.out.println("Not Valid");
	}
	}
	else
	{
		System.out.println("Enter valid string");
	}
	}

}
