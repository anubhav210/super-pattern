import java.io.BufferedReader;
import java.io.InputStreamReader;
class  Swap1 // 7
{
	public static void main(String[] args) throws Exception
	{
		
		BufferedReader obj=new BufferedReader( new InputStreamReader(System.in));
		System.out.print("Enter First Number : ");
		int a=Integer.parseInt(obj.readLine());
		System.out.print("Enter Second Number : ");
		int b=Integer.parseInt(obj.readLine());
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("Enter First Number : " +a);
		System.out.print("Enter Second Number : "+b);

	}
}
