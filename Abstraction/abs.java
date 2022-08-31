							/* Abstraction : class */
/*
==>	Abstraction is process of hidding the implementation details
	from the user, only the heighlighted Set of Services provided to the user.

==> Advantage of abstraction:
	--> Security
	--> Enhancement
	
==*==> Abstract Class : 
	
	--> A class which contains the abstract keyword in its declration
		 is called abstract class.
	
note :- 1) we can't create object of abstract class.
		2) It may or may not contain abstract methods.
		3) It can have abstract & non- abstract methods.
		4) To use an abstract class, you have to inherite from sub class.
		5) If a class contains partial implimentation then we should declare 
			a class as abstract.
			

*/
/*
abstract class animal
{
	public abstract void sound();
}
class Dog extends animal
{
	public void sound()
	{
		System.out.println("Dog is Barking...");
	}
}
class Lion extends animal
{
	public void sound()
	{
		System.out.println("Lion is Roar...");
	}
}
class abs
{
	public static void main(String[] args)
	{
		//animal r = new animal();		// 1) error : animal is abstract : can't be  instansiated.
		
		Dog d = new Dog();
		Lion l = new Lion();
		
		d.sound();
		l.sound();
		
	}
}
*/
/*

Output: 

S:\java\Abstraction>javac abs.java

S:\java\Abstraction>java abs
Dog is Barking...
Lion is Roar...


*/

/*
 2. call abstract class constructor through super() from sub class
*/
abstract class animal
{
	animal()
	{
		System.out.println("Abstract class Constructor ...");
	}
	public abstract void sound();
}
class Dog extends animal
{
	Dog()
	{
		super();
	}
	public void sound()
	{
		System.out.println("Dog is Barking...");
	}
}
class Lion extends animal
{
	Lion()
	{
		super();
	}
	public void sound()
	{
		System.out.println("Lion is Roar...");
	}
}
class abs
{
	public static void main(String[] args)
	{
		//animal r = new animal();		// 1) error : animal is abstract : can't be  instansiated.
		
		Dog d = new Dog();
		Lion l = new Lion();
		
		d.sound();
		l.sound();
		
	}
}
/*
Output:

S:\java\Abstraction>javac abs.java

S:\java\Abstraction>java abs
Abstract class Constructor ...
Abstract class Constructor ...
Dog is Barking...
Lion is Roar...

*/
