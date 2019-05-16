class AdjacentEven // 9 
{
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);

		System.out.print("next adjacent even no. of "+a+" : "+((a%2==0)?(a+2):(a+1))+"\n\nnext adjacent even no. of "+b+" : "+((b%2==0)?(b+2):(b+1)));

	}
}
