						/*  Collection Framwork */
/*

==> Java Collection are the set pf pre-defined classes and interface that helps
	programs to perform diffrent kind of data structure Oprations like :
	Sorting, Searching, Traversing, Storing and processing data efficently.
	
	
									Iterable	
									    ^
										|
									Collection
										^
										|
		--------------------------------------------------------------------------------------------------------------------------------
		|					|								|					|
		List			   	Queue							Set					Map
		 - Array list		 - PriorityQueue         		- HashSet
		 - Link list		 - Dequeu				 		- Linked Hashset
		 - Link list		 - Array Dequeue		 		- TreeSet
		 - Vector
		 - Stack
		 


*/		
			
import java.util.ArrayList;

class javaCollections
{
	public static void main(String args[])
	{
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Sagar");
		name.add("Akshit");
		name.add("Kamal");
		name.add("Sijo");
		
		System.out.println(name);
		
		name.add("Atmiya");		
		System.out.println(name);
		
		name.add(2,"Shlok");		
		System.out.println(name);
		
		name.remove(1);
		System.out.println(name);
		
		name.set(3,"Maharshi");
		System.out.println(name);
		
		System.out.println(name.get(4));
		
		name.clear();
		System.out.println(name);
		
		
	}
}

/*
==============================================
Output:

S:\java\Collection Framwork>javac basic_01.java

S:\java\Collection Framwork>java javaCollections
[Sagar, Akshit, Kamal, Sijo]
[Sagar, Akshit, Kamal, Sijo, Atmiya]
[Sagar, Akshit, Shlok, Kamal, Sijo, Atmiya]
[Sagar, Shlok, Kamal, Sijo, Atmiya]
[Sagar, Shlok, Kamal, Maharshi, Atmiya]
Atmiya
[]

*/
