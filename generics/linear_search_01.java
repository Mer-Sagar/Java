/*

	==>type safety
	--> Reducing of lines
	--> 
	
	
	--> Lexicl graphy order
	--> Oracle docs Collection interface
	--> Cronological order
	
	Bloated code--> int->
	
	
	C++ --> expansion rule:	
					
	Generics is run time polymorphism
	java --> erasable rule:
	
	
	
	*/
/* 	
class LinearSearch<T extends Comparable<T>>
{
	public int search(T[] arr, T x, int len)
	{
		for(int i=0; i<len; i++)
		{
			if(arr[i]==x)
			{
				return i;
			}				
		}
			return -1;
	}
} */

class linear_search_01
{
	public static void main(String args[])
	{
		LinearSearch<Integer> l = new LinearSearch<Integer>();
		
		Integer arr[] = {2,3,4,10,40};
		int n = arr.length;
		Integer x = 10;
		//int x =40;
		
		//Integer result =search(arr,x,n);
		if(l.search(arr,x,n)== -1)
		{
			System.out.println("Element is not present in array");
			
		}
		else
		{
			System.out.println("Element is present in index "+l.search(arr,x,n));
		}
 	}
}
 