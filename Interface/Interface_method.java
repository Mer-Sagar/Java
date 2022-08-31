 								/* Interface Variables */
/*

==> Interface Method: by default 
				- public 
				- abstract 
				
Note:
	1) Interface Variable must be inistilize at declration time
	2) Interface variable are by default public, static, final.

*/
import java.util.Scanner;

interface Client
{
	void webdesign();	// public + abstract	
	void webdevelope();	// public + abstract	
}
abstract class SagarTech implements Client
{
	@Override
	public void webdesign()
	{
		System.out.println("webdesign method executed...");
	}	
}
class AkshitTech extends SagarTech
{
	@Override
	public void webdevelope()
	{
		System.out.println("webdevelope method executed...");
	}	
}
class Interface_method 
{
	public static void main(String[] args)
	{
		Client c = new AkshitTech();
		c.webdesign();
		c.webdevelope();
	}	
}

/*

S:\java\Interface>javac Interface_method.java

S:\java\Interface>java Interface_method
webdesign method executed...
webdevelope method executed...
*/