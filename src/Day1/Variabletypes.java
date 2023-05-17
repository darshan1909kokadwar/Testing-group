package Day1;

public class Variabletypes {

	int c=30;           //inside class outside method=global non static variable
	
	 static int d=50;          //inside class outside method=global  static variable
	public void nonstaticmethod()
	{
		int a=10;       //inside class inside method =local non static variable
	
	 int sum=a+c+d;
	
	}
	
	
	public static void staticmethod()
	{
		int b=20;           //inside class inside method =local static variable
	int sub=b-d;
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		
    staticmethod();
	}

}
