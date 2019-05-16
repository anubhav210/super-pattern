import java.util.Scanner;
class pattern10
{
	public static void main(String[] ar)
	{
			Scanner ob=new Scanner(System.in);
			int size=ob.nextInt();
		int[][] arr= new int[size][size];
		for(int i=0;i<=(arr.length)-1;i++)
		{
			for(int j=0;j<=(arr[i].length)-1;j++)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}