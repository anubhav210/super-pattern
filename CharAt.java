class CharAt 
{
	public static void main(String[] args) 
	{
		String s="hello anubhav";
		char[] a=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
		a[i]=s.charAt(i);
		}
		for(char c:a)
		{
		System.out.print(c+" ");
		}
	}
}
