package variablesdatatypes;  //main method call in main program name

public class Globalandlocalvariables {
	
	int c=30;
	static int d=40;
	
	
	public void nonstaticmethod()
	{
		int a=20;
		int sum=a+c+d;
		
	}
	
	public static void staticmethod()
	{
		int b=90;
		int sub=b-d;
		
	}

}
