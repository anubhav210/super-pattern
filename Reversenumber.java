import java.util.Scanner;
class  ReverseNumber // 2.1
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number for Reverse : ");
		int num=obj.nextInt();
		int rev=0;
		while(num>0)
		{
		rev=rev*10+(num%10);
		num=num/10;
		}
		System.out.print("Reverse : "+rev);
	}
}
