package variablesdatatypes;

public class Calculator {
	
	int a=10;  //nonstatic global variable
	int  b=20;  //nonstatic global variable
	static int y=90;  //static global variable
	static String name="Darshan";  //static global variable
	static int x=30;
	
	public static void addition()
	{
		int d=40;  //static local variable
		int h=50;
		int sum;
		sum=y+x+d+h;
		System.out.println(sum);
		System.out.println(name);
	
	}
	
	public void multiplication()
	{
		int s=12;  //non static local variabel
		int p=67;
		int mul;
		mul=s*p*a*b*y*x;
		System.out.println(mul);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calculator obj=new Calculator();
      obj.multiplication();
      addition();
      
	}

}
