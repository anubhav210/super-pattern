import java.io.BufferedReader;
import java.io.InputStreamReader;

class InputByBufferedReader1
{
public static void main(String[] ar)
throws Exception
{
System.out.print("wenetr a number for take input from keyboard : ");
 
 BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));

int number=ob.readLine();

System.out.println("given number is : " + (number+number));
}
} 
