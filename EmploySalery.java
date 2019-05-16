import java.util.Scanner;
class EmploySalery 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the basic salery of employee : ");
		double bs=obj.nextDouble();
		double total;
		total=bs<1500?double hra=((10*bs)/100)+double da=((90*bs)/100) (hra+da):200000;
		System.out.print(total+" "+hra+" "+da);
		


	}
}
