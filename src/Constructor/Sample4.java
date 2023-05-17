package Constructor;



public class Sample4 {
	int a;
	int b;
	
	public Sample4()
	{
		int a=10;
		int b=20;
	}
	public Sample4(int c,int d)
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
	Sample4 object=new Sample4();
	
	object.addition();
}
}
