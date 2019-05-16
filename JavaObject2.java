import java.util.Scanner;
class JavaObject2
{
	int i;
	JavaObject2(int i)
	{
	this.i=i;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		JavaObject2 t1=new JavaObject2(111);
		System.out.print(t1);
		System.out.println("-----------------------------");
		JavaObject2 t2=new JavaObject2(111);
		System.out.println(t2);
		System.out.print("-----------------------------");
		JavaObject2 t3=new JavaObject2(111);
		System.out.println(t2.equals(t3));
	}
	
		public String toString()
	{
	return Integer.toString(i);
	}
}
