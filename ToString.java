class  ToString
{
	String obj;
	ToString(String obj)
	{
	this.obj=obj;
	}
	@Override
	public String toString()
	{
	return obj;
	}
	public static void main(String[] args) 
	{
		ToString obj=new ToString("helllo");
		System.out.print(obj);
		
	}
}
