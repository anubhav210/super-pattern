import java.io.BufferedReader;
import java.io.InputStreamReader;

class InputByBufferedReader
{
public static void main(String[] ar)
throws Exception
{
System.out.print("enetr a number for take input from keyboard : ");
/* InputStreamReader ins=new InputStreamReader(System.in);
 BufferedReader ob=new BufferedReader(ins);
 */

BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
int number=Integer.parseInt(ob.readLine());

System.out.println("given number is : "+number);
}
} 