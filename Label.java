class Lebel
{
	public static void main(String[] args)
	{
		FIRST_LOOP:for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==3)
				{
					continue FIRST_LOOP;
				}
				System.out.print("i="+i+" j="+j+"\t");	
			}
				System.out.println();
		}
	}
}