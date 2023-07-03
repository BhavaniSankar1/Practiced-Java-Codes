public class demo_Continue {

	public static void main(String[] args) 
	{
		int i=1, j;
		
		lp1: while(i<=3)
		{
			System.out.print(i);
			
			lp2: for(j=1; j<=5; j++)
			{
				System.out.println("\t"+ j);
				if(j==3)                           //by using the if condition we cut off the values 4 & 5
				{
					i++;
					continue lp1;                  // if the value is 3 then loop 2 is stopped and loop1 is executed
				}
				
			}
			i++;
			System.out.println("-------xxx-------");
		}
	}
	
	

}
