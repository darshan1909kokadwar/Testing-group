package Constructor;

public class Sample3 {
	int a;
	int b;
	
	public Sample3()
	{
		int a=10;
		int b=20;
	}
	public Sample3(int c,int d)
	{
		a=c;
		b=d;
		
	}
	public void addition()
	{

		System.out.println(a+b);
	}
	public void multi()
	{
		System.out.println(a*b);
	}
public static void main(String[] args) {
	Sample3 object=new Sample3();
	
	object.addition();
}
}
