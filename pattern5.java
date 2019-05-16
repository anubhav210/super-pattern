class pattern5
{
	public static void main(String[] ar)
	{
		for(int i=1;i<=5;i++)
		{	
			for(int k=5;k>=i+1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}