								/*		ArrayDeque 		*/
import java.util.ArrayDeque;

class javaCollections
{
	public static void main(String args[])
	{
		ArrayDeque<String> name = new ArrayDeque<String>();		// FIFO
		
		name.push("Sagar");
		name.push("Akshit");
		name.push("Kamal");
		name.push("Sijo");
		
		System.out.println(name);
		
		name.pop();
		System.out.println(name);
		
		name.push("Rugved");
		System.out.println(name);
		
		
		System.out.println("================================");
		
		for(String str:name)
		{
			System.out.println(str);
		}	

		name.add("Sagar1");
		name.add("Akshit1");
		name.add("Kamal1");
		name.add("Sijo1");
		
		System.out.println(name);
		
		name.remove();
		System.out.println(name);		
		
		System.out.println("================================");
		
		for(String str:name)
		{
			System.out.println(str);
		}
		
	}
}

/*
=============================================================
Output:
S:\java\Collection Framwork>javac CollectionStack.java

S:\java\Collection Framwork>java javaCollections
[Sagar, Akshit, Kamal, Sijo]
[Sagar, Akshit, Kamal]
[Sagar, Akshit, Kamal, Rugved]
================================
Sagar
Akshit
Kamal
Rugved

*/
