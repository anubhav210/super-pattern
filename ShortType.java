class staticblock
{
	static short i;
	static byte s=124;
	static byte t=1;

 public static void main(String[] args)
{
	i=(byte)(s+t);
	System.out.println(i+i);
	
	

}
static
{
	System.out.println(i);
	System.out.println(i);
}
}