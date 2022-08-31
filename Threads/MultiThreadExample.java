class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("From Thread 1 with i = "+ -1*i);
		}
		System.out.println("Exiting from Thread 1");
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int j=1; j<=5; j++)
		{
			System.out.println("From Thread 2 with j = "+ -2*j);
		}
		System.out.println("Exiting from Thread 2");
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		for(int k=1; k<=5; k++)
		{
			System.out.println("From Thread 3 with k = "+ (2*k-1));
		}
		System.out.println("Exiting from Thread 3");
	}
}
class MultiThreadExample
{
	public static void main(String args[])
	{
		Thread1 a = new Thread1();
		Thread2 b = new Thread2();
		Thread3 c = new Thread3();
		
		a.start();
		b.start();
		c.start();
		
		System.out.println("Exiting from Multithreading ...");
	}
}