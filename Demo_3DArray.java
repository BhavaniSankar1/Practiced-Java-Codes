import java.util.*;

public class Demo_3DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot=0;
		
		int arr[][][] = {{{50,51,52}, {53,54,55}}, {{56,57,58},{59,60,61}}, {{62,63,64},{65,66,67}}};
		
		for(int dept=0; dept<3; dept++)
		{
			System.out.println("Department " + (dept+1) + ": ");
			for(int student=0; student<2; student++)
			{
				System.out.print("Student " + (student+1) + " marks : ");
				{
					for(int marks=0; marks<3; marks++)
					{
						System.out.print(arr[dept][student][marks] + " ");
						tot += arr[dept][student][marks];
					}
					System.out.println("Total : " + tot);
					tot = 0; //reset the total value after printing
				}
				
			}
			System.out.println();
		}

	}

}
