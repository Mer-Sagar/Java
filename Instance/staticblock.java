								/* Static Block */
/* 
	==> Static block is such kind of block in java which get 
	        executed at the time of loading the .class file into JVM memory.
		
		staticblock.java --> javac --> static.class ==>in JVM{ class loader -> byte code viewer-> extantion enginee}
		
		--> it runs before instnce block.
		
		--> it only one time execuit.
*/
class A
{
	static
	{
		System.out.println("Static Block Executed.....");
	}	

	public static void main(String[] args)
	{
		
	}	
	
	
}


/* ====================================================
Output : 


S:\java\Instance>javac instanceblock.java

S:\java\Instance>java B
10 20
30 40
50 60

------------------------------------------------------------------
S:\java\Instance>javac instanceblock.java

S:\java\Instance>java B
Static Method Executed.....
10 20
30 40
50 60

*/