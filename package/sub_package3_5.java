import Sagar.package3_5;			// user defind package

public class sub_package3_5
{
	public static void main(String[] args)
	{
		package3_5 r = new package3_5();
		r.show();
	}
}

/*

Output:

S:\java\package>javac -d . package3_5.java

S:\java\package>javac -d . sub_package3_5.java

S:\java\package>java sub_package3_5
Class package3_5 show method executed...
*/