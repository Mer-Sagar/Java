						/* File Reaname */
						
import java.io.*;

class Rename_File
{
	public static void main(String[] args)
	{
		File f = new File("test.txt");
		File new_nm = new File("Sagar.txt");
		
		if(f.exists())
		{
			System.out.println(f.renameTo(new_nm));
		}
		else
		{
			System.out.println("File not Found");
		}
		
	}
}