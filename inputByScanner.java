import java.util.Scanner;
class InputByScanner
{
public static void main(String[] ar)
{
System.out.println("Enter a number for take input from keyboard");
Scanner ob=new Scanner(System.in);
int var=ob.nextInt();
System.out.println("Entered number is"+var);

}
}