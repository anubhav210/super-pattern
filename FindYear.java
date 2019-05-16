import java.util.Scanner;
class FindYear // 4
{
	public static void main(String[] args) 
	{
		System.out.print("Enter days : ");
		Scanner obj=new Scanner(System.in);
		int days=obj.nextInt();
		int years=days/365;
		int month=(days%365)/30;
		int day=(days%365)%30;

		System.out.print(years+" "+month+" "+day);


	}
}
