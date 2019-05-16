import java.util.Scanner;
class SimpleInterest // 3
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Principle Amount for find the simple interest : ");
		int principle=obj.nextInt();
		System.out.print("Enter the Rate for find the simple interest : ");
		double rate=obj.nextDouble();
		System.out.print("Enter the time period in months : ");
		short time=obj.nextShort();
		System.out.print("Simple Interest : "+((principle*rate*time)/(100*12)));
	}
}
