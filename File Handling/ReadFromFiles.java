import java.io.FileNotFoundException;
import java.io.File; 
import java.util.Scanner;
 
 public class ReadFromFiles
 {
	public static void main(String[] args)
	{		  
		try
		{
			// Creating an object of the file for reading the data
			File fobj = new File("test.txt");					// relative file path    
			 
			Scanner myReader = new Scanner(fobj);
			 
			while(myReader.hasNextLine())
			{
				String data = myReader.nextLine();
				System.out.println(data);
			}
			//myReader.close();				// for read close is not compulsury, but for write close is not compulsury.
		}
		catch(FileNotFoundException e)
		{
			System.out.println("error :--> "+e);
			//e.printStackTrace();
		}
	}
 }