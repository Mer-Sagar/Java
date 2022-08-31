										/* File Reader */

/*
import java.io.*;

class File_Reader
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("pqr.txt");
			
			try
			{
				int i;
				while( ( i = fr.read() ) != -1)
				{
					System.out.print((char)i);
				}
			}
			finally
			{
				fr.close();
			}
		}
		catch(IOException i)
		{
			System.out.println("Error : --> "+i);
		}		
	}
}

*/

/*
import java.io.*;

class File_Reader
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("pqr.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		int i;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}
*/


import java.io.*;

class File_input_stream
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("pqr.txt");
		
		int i=0;
		
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}