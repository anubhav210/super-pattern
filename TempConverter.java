import java.util.Scanner;
class TempConverter //5
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Temprature in Fehrenheit : ");
		float feh=obj.nextFloat();
		System.out.print("Temprature in Celsius : "+(5*(feh-32)/9));
	}
}
