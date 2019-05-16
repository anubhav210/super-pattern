class pattern3
{
	public static void main(String[] ar)
	{	int k=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=i;j<=k;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			k=k+i;
		}
	}
}