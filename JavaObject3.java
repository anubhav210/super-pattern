import java.util.Scanner;
class JavaObject3
{
	int i;
	JavaObject3(int i)
	{
	this.i=i;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		JavaObject3 t1=new JavaObject3(111);
		System.out.print(t1);
		System.out.println("-----------------------------");
		JavaObject3 t2=new JavaObject3(111);
		System.out.println(t2);
		System.out.print("-----------------------------");
		JavaObject3 t3=new JavaObject3(333);
		System.out.println(t2.equals(t3));
	}
	
		public boolean equals(Object ob)
	{
			JavaObject3 ref=(JavaObject3)ob;
	return this.i==ref.i;
	}
}
