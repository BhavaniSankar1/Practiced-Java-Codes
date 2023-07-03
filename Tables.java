import java.io.*;

public class Tables {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number");
		int num = Integer.parseInt(br.readLine());
		int result;
		for(int i=0; i<=10; i++)
		{
			result = num*i;
			System.out.println(num + "x" + i + "=" + result);
		}

	}
	
}
