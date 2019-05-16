class Turnery
{
	public static void main(String[] args)
	{
		int x=21;
		System.out.println(x>10?x%2==0?10:x%5==0?20:30:40);
		System.out.println(x);
		System.out.println(x%2==0?10:x%5==0?20:x%6==0?30:40);
	}
}