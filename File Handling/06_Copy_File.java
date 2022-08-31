									/* Copy File */
import java.io.*;

class Copy_file
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fin = new FileInputStream("Sagar.txt");
		FileOutputStream fout = new FileOutputStream("new_Sagar.txt");
		
		int i;
		while((i=fin.read())!=-1)
		{
			fout.write((char)i);
			
		}
		System.out.println("Data Copied Succesfuly");
		
		
	}
}
									