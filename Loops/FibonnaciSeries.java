import java.io.*;

public class FibonnaciSeries
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the count of the Fibonnaci Series: ");
		int n = Integer.parseInt(br.readLine());
		
		int f1=0, f2=1;
		System.out.println(f1);
		System.out.println(f2);
		
		int f = f1+f2;
		System.out.println(f);
	    for(int count=3; count<n; count++)
	    {
	        f1=f2;
	        f2=f;
	        f=f1+f2;
	        System.out.println(f);
	    }
	    
	    /*using while loop 
	    int count =3;
	    while (count<n)
	    {
	        f1=f2;
	        f2=f;
	        f=f1+f2;
	        System.out.println(f);
	        count++;
	    }
	    */
	}
}
