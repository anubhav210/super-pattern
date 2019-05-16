class  DoubleArray
{
	void m1(double[] d)
	{
		for(double dd:d){
		System.out.println(dd);}
	}
	public static void main(String[] args) 
	{
		DoubleArray ob=new DoubleArray();
		double arrr[] =new double[9];
		ob.m1(arrr);
	}
}
