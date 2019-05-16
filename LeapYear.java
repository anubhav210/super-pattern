import java.util.Scanner;

class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a year : ");
		short num=obj.nextShort();

		System.out.print((num%4==0)?"Given year is Leap":"Given year is not  Leap");
	}
}
