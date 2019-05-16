import java.io.*;
class FileInputStreamEx 
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{	
		File f=new File("pattern2.java");
		FileInputStream fill=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream("jklm.txt");
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
