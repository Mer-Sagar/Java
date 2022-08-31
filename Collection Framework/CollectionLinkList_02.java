// store in double link list
import java.util.LinkedList;

class javaCollections
{
	public static void main(String args[])
	{
		LinkedList<String> name = new LinkedList<String>();
		
		name.add("Sagar");
		name.add("Akshit");
		name.add("Kamal");
		name.add("Sijo");
		
		System.out.println(name);
		
		name.add("Kishan");		
		System.out.println(name);
		
		name.addFirst("Shlok");		
		System.out.println(name);
		
		name.addLast("Rugved");		
		System.out.println(name);
		
		name.add(3,"Aniket");		
		System.out.println(name);
		
		name.remove(2);
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
==============================================
Output:

S:\java\Collection Framwork>javac CollectionLinkList_02.java

S:\java\Collection Framwork>java javaCollections
[Sagar, Akshit, Kamal, Sijo]
[Sagar, Akshit, Kamal, Sijo, Kishan]
[Shlok, Sagar, Akshit, Kamal, Sijo, Kishan]
[Shlok, Sagar, Akshit, Kamal, Sijo, Kishan, Rugved]
[Shlok, Sagar, Akshit, Aniket, Kamal, Sijo, Kishan, Rugved]
[Shlok, Sagar, Aniket, Kamal, Sijo, Kishan, Rugved]
[Sagar, Aniket, Kamal, Sijo, Kishan, Rugved]
================================
Sagar
Aniket
Kamal
Sijo
Kishan
Rugved


*/

