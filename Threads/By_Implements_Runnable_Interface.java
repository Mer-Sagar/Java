// By_Implements_Runnable_Interface
class A1 implements Runnable
{
	public void run()
	{
		
	}
}
class B1
{
	public static void main(String[] args)
	{
		A1 r = new A1();
		
		Thread t = new Thread(r);
		t.start();
		
		
		
	}
	
}