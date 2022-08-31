										/*	File Create	 */

import java.io.*;

class Create_File
{
	public static void main(String args[]) throws IOException
	{
		File f = new File("abc.txt");
		try
		{
			if(f.createNewFile())
			{
				System.out.println("File Successfuly Created...");				
			}
			else
			{
				System.out.println("File already exist...");
			}
		}
		catch(IOException i)
		{
			System.out.println("Exception Handled...");
		}
		
	}
}