import java.io.*;

public class Demo_Switch_Statement {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the character: ");
		char colour = br.readLine().charAt(0);
		
		switch (colour)
		{
		case 'r' :
			System.out.println("Red");
			break;
		case 'g' :
			System.out.println("green");
			break;
		case 'b':
			System.out.println("Blue");
			break;
		case 'o' :
			System.out.println("Orange");
			break;
		default :
			System.out.println("Colour not found");
		}

	}

}
