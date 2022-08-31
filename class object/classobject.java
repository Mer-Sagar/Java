/** What is oop? 

	OOP stands for object orianted Programing Language. 
	It is to deal with real world entity using programing language.
	
	
	OOPS Features:
	
	- Class
	- Object 		: it is a instance of class
	- Inhertance	: Re-usabilyty of code
	- Polymorphism  : same object diffrent behaviour
	- Encapsulation : wrap/bind data(methods) in singe unit
	- Abstraction   : data hidding 
	
==> Need of OOPs?
	
	--> Complex to handel when program is too big in POP.


==> What is class?
	--> Class is a collaction of object and it doesn't take any sapce on memory. 
	--> Class is also called as blueprint/logical entity.
	-->	two type of class : 
				1. Pre defined class
					Scanner, Consol, System, String
				2. User definded class
					Dog, Box, Test,Demo
					
	
*/
class Demo
{		
	int a=10;
	String b="Sagar";
	
	void show()
	{
		System.out.println(a+" "+b);
	}
	
}
class classobject
{
		public static void main(String[] args)
		{
			Demo o = new Demo();
			o.show();
		}
}