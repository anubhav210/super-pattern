class pattern14
{
	public static void main(String[] ar)
	{	int i;
		for( i=1;i<=5;i++)
		{	
			for(int k=5;k>=i+1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=i-2;i>=1;i--)
		{	
			for(int k=5;k>=i+1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}