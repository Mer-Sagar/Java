/*string buffer program which uses of buffer method to concateination of sting
 representation of any ither type os data to the end of  invoking string 
 buffer object it should also hashcode of string. 
 
 basic 
 if
 loop
 case
 collection 
 
 --> generics threds

 36 questions */
public class StringCompare
{
	public static void main(String args[])
	{
		String s1="Akshit";
		System.out.println(s1);
		
		String s2="Akshit";					//pool
		System.out.println(s2);
		
		String s3= new String("Akshit");		//heap
		System.out.println(s3);
		
		String s5= new String("Akshit");
		
		System.out.println("after intern"+ s3==s5);
		
		String s4 = s3.intern();			//
		
		String s7 = s1.intern();
		final String s6 = s3.intern();
		
		System.out.println(s7);
		System.out.println("-->"+(s3==s5));
		System.out.println(s3.equals(s5));
		
		System.out.println(s4);
		
	}
}