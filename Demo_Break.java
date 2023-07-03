
public class Demo_Break {

	public static void main(String[] args)
	{
		boolean x = true;
		block1:{
			block2:{
				block3:{
					System.out.println("Block 3");
					if(x)
						break block2; //goto end of block2 //block 2 will not get executed 
				}
				System.out.println("Block 2"); //end of block2 
			}
			System.out.println("Block 1"); //end of block1
		}
		System.out.println("Out of all blocks");


	}

}
