										/*	File Write */

/*
import java.io.*;

class File_Write
{
	public static void main(String args[]) throws IOException
	{
		FileWriter fw = new FileWriter("pqr.txt");
		
		try
		{
			fw.write("My name is Sagar. I am indian.");
		}
		finally
		{
			fw.close();
		}
		System.out.println("Successfuly Data Wrote in a file");	
		
	}
}

*/

/*
import java.io.*;

class FileBuffer
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("3_pqr.txt");
		
		BufferedWriter bf = new BufferedWriter(fw);
		
		try
		{
			bf.write("My name is Sagar. I am Indian");
		}
		finally
		{
			bf.close();
		}
		
		System.out.println("Wrote Successfuly...");
	}
}

*/

/*
import java.io.*;

class FileOutput_Stream
{
	public static void main(String[] args) throws IOException
	{
		// FileWriter f =new FileWriter("4_pqr.txt");
		
		FileOutputStream fs = new FileOutputStream("4_pqr.txt");
		
		try
		{
			fs.write(65);
		}
		finally
		{
			fs.close();
		}
		System.out.println("Wrote Successfuly...");
	}
}
*/

import java.io.*;

class Print_Writer
{
	public static void main(String[] args) throws Exception
	{
		PrintWriter pw = new PrintWriter(new File("4_pqr.txt"));
		
		//PrintWriter pw = new PrintWriter(System.out);
		
		pw.write("This code is from Printwriter");
		
		pw.flush();  
		pw.close();
	}
}
