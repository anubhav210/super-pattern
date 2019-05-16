class Book1 // 10
{
	public static void main(String[] args) 
	{
		String s=new String("Simple:Object-Oriented:Portable:Platform:independent1:Secured:Robust:Architecture neutral:Dynamic:Interpreted:High Performance:Multithreaded:Distributed");
String[] point=s.split(":");
System.out.print("\t\t\tFeathers of Java\n\t\t\t----------------\n\n\n");

for(int i=0;i<point.length;i++)
		{
			System.out.print("\t"+i+". "+point[i]+"\n");
		}
	}
}
