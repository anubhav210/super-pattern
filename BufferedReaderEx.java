import java.io.*;
class BufferedReaderEx
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{	
		
		BufferedReader fill=new BufferedReader(new FileReader("jklm.txt"));
		BufferedWriter fos=new BufferedWriter(new FileWriter("jkl.txt"));
		String c;
		while((c=fill.readLine())!=null)
		{
			fos.write(c); // write the charcter into file jklm.txt
			System.out.print(c);
		}
		fill.close();
		fos.close();
	}
}
