class Pattern15 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
		for(int j=0;j<=5;j++)
			{
				if(i<j)
				{
				System.out.print(" ");		// 00 01 02 03
				}								// 10 11 12 13
				else							// 21 22 23 24
				{
					if(((i+j)%2)==1)
					{
				System.out.print("0");}
					else{
				System.out.print("1");}

				}
				
			}
			System.out.println();
		}
	}
}
