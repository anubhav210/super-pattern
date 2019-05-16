import java.io.*;
class AWord
{	
	public static void main(String[] args) throws FileNotFoundException,IOException
	{	
		String a=null;
		BufferedReader fill=new BufferedReader(new FileReader("A.txt"));
		BufferedWriter fos=new BufferedWriter(new FileWriter("jkl.txt"));
		String c;
		while((c=fill.readLine())!=null)
		{
			a +=c+"\n";// write the charcter into file jklm.txt
			//Search Google or type URL
			
		}
		System.out.print(a);
		fill.close();
		fos.close();
	}
}
