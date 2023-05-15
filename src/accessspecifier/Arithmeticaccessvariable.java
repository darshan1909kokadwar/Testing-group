package accessspecifier;

public class Arithmeticaccessvariable {
	
	public static int a=10;
	int b=40;
	private static int c=50;
	protected static int d=30;
	protected int e=90;
	
	
	public static void common()
	{
		int sum=a+c+d;
		System.out.println(sum);
	}
	
	public void common1()
	{
		int mul=a*b*c+d;
		System.out.println(mul);
	}
	
	protected static void common2()
	{
		int mul=a+d;
		System.out.println(mul);
	}
	protected  void common3() ///non static protected method can access only in different class same package
	{
		int mul=e;
		System.out.println(mul);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       common();
       common2();
       Arithmeticaccessvariable obj=new Arithmeticaccessvariable();
       obj.common1();
       obj.common3();
      
       
	}

}
