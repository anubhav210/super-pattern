import java.util.Scanner;
class Array_a
	{
		public static void main(String[] arga)
		{
			/* int[][] far={{1,2,3},{4,5,6},{7,8,9}};
			for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
			{
			System.out.println(far[i][i]); */
			
			
			Scanner ob=new Scanner(System.in);
			int ar[][]=new int[3][3];
			for(int i=0;i<2;i++)
				{
				for(int j=0;j<3;j++)
					{
					 ar[i][j]=ob.nextInt();
					}
				}
			for(int i=0;i<3;i++)
				{
				for(int j=0;j<3;j++)
					{
					if(i==j)
						{
						System.out.print("a["+i+"]["+j+"]="+ar[i][j]+"\t");
						}
					else
						{
						System.out.print("----\t");
						}
					}
				System.out.print("\n");
				}
				System.out.println("THANKS");
		}	
	}

// 123
// 456
// 789