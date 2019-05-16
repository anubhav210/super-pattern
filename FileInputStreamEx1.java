import java.io.*;
class FileReaderEx
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{	
		
		FileReader fill=new FileReader("jkl.txt");
		FileWriter fos=new FileWriter("jklmn.txt");
		int c;
		while((c=fill.read())!=-1)
		{
			fos.write(c); // write the charcter into file jklm.txt
			System.out.print((char)c);
		}
		fill.close();
		fos.close();
	}
}
