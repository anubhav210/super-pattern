import java.util.Scanner;
class PrintTable 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the basic salery of employee : ");
		int val=obj.nextInt();
		for(int i=1;i<=10;i++)
		System.out.print(i*val+"\n");
	}
}
