class Shape
{
	void meth()
	{
		System.out.println("I am Indian");
	}
}

class Square extends Shape
{
	void meth()
	{
		System.out.println("I am Hindustani");
	}
}

class Temp
{
	public static void main(String args[])
	{
		Shape sp = new Square();	//Shape no obj bane che
		sp.meth();
	}
}