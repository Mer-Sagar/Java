								/*		Stack 		*/
import java.util.Stack;

class javaCollections
{
	public static void main(String args[])
	{
		Stack<String> name = new Stack<String>();		// LIFO
		
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
