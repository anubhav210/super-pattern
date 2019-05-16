import java.util.Scanner;
class JavaObject1
{
	int i;
	JavaObject1(int i)
	{
	this.i=i;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		JavaObject1 t1=new JavaObject1(111);
		System.out.println(t1);
		System.out.println("-----------------------------");
		JavaObject1 t2=new JavaObject1(222);
		System.out.println(t2);
		System.out.println("-----------------------------");
		JavaObject1 t3=new JavaObject1(111);
		System.out.println(t3);
	}
	
		public String toString()
	{
	return Integer.toString(i);
	}
}
