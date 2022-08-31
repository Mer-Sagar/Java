class Thread1 implements Runnable
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
class Thread2 implements Runnable
{
	public void run()
	{
		for(int j=1; j<=5; j++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Exiting from Thread 2");
	}
}
class Thread3 implements Runnable
{
	public void run()
	{
		for(int k=1; k<=5; k++)
		{
			//System.out.println("From Thread 3 with k = "+ (2*k-1));
			System.out.println(Thread.currentThread().getId());
			try
			{
				Thread.sleep(1200);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Exiting from Thread 3");
	}
}
public class MultiThreadInterface 
{
	public static void main(String args[])
	{
		//Thread a = new Thread(new Thread1());
		//Thread b = new Thread(new Thread2());
		//Thread c = new Thread(new Thread3());
		
			
		Thread1 a = new Thread1();		
		Thread t1 = new Thread(a);
		
		Thread2 b = new Thread2();		
		Thread t2 = new Thread(b);
		
		Thread3 c = new Thread3();		
		Thread t3 = new Thread(c);
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occured");
		}
		
		//a.start();
		//b.start();
		//c.start();
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Exiting from Multithreading ...");
	}
}
