
public class Demo_Nested_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=3; i++) //outer loop is executed 3 times 
		{
			System.out.print("int i = " + i + " ");
			for(int j=1; j<=4; j++) //inner loop will be executed 3*4=12 times
			{
				System.out.print("int j = " + j + " ");
			}
			System.out.println();
		}

	}

}
