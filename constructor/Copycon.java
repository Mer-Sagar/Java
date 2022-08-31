									/* Copy Constructor */
/*class Acopy
{
	int p,q;
	String nm;
	
	Acopy()	
	{
		p=10;
		nm= "India";
		System.out.println(p+" :-"+nm);
	}
	Acopy(Acopy ref)		// Copy Constructor
	{
		p=ref.p;
		nm=ref.nm;
		System.out.println(p+" :-"+nm);
	}
	
}
class Copycon
{
	public static void main(String[] args)
	{
		Acopy obj = new Acopy();
		Acopy obj1= new Acopy(obj);			// Copy call
		
	}
}
*/
/*
======================================================
==>Whenever we pass object refrerence to the constructor then
	it is called copy constructor.
	
	need --> ek object na badha data bija object ma copy kari sake...

Output: 

S:\java\constructor>javac Copycon.java

S:\java\constructor>java Copycon
10 :-India
10 :-India



*/

// Copying values without constructor

class Student7
{  
    int id;  
    String name;  
    
	Student7(int i,String n)
	{  
		id = i;  
		name = n;  
    }  
    
	Student7()
	{
		
	}  
	
    void display()
	{
		System.out.println(id+" "+name);
	}  
   
    public static void main(String args[])
	{  
		Student7 s1 = new Student7(21,"Sagar");  
		Student7 s2 = new Student7();  
		
		s2.id=s1.id;  
		s2.name=s1.name;  
    
		s1.display();  
		s2.display();  
   }    
}

/*
=======================================================
Output: 

S:\java\constructor>javac Copycon.java

S:\java\constructor>java Student7
21 Sagar
21 Sagar
*/