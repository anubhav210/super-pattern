import java.util.Scanner;
class JavaObject4
{
	int i;
	String s;
	JavaObject4(int i,String s)
	{
	this.i=i;
	this.s=s;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		JavaObject4 t1=new JavaObject4(111,"anu");
		System.out.print(t1);
		System.out.println("-----------------------------");
		JavaObject4 t2=new JavaObject4(111,"shyam");
		System.out.println(t2);
		System.out.print("-----------------------------");
		JavaObject4 t3=new JavaObject4(111,"raju");
		System.out.println(t2.equals(t3));
	}
	
		public String toString()
	{
	return Integer.toString(i+" "+s);
	}
}
