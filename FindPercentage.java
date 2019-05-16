class FindPercentage // 2
{
	public static void main(String[] args) 
	{	int arg[]=new int[3];
		arg[0]=Integer.parseInt(args[0]);
		arg[1]=Integer.parseInt(args[1]);
		arg[2]=Integer.parseInt(args[2]);
		System.out.print("Sum of Marks : "+(arg[0]+arg[1]+arg[2])+"\n Percentage : "+((arg[0]+arg[1]+arg[2])/3));
	}
}
