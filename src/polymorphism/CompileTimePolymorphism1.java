package polymorphism;

public class CompileTimePolymorphism1 {
	static int a=70;
static int b=80;
	int c=30;
	int d=40;
	
	public static void addition()
	{
	
		int sum=a+b;
		System.out.println(sum);
	}
	public void addition(int i)
	{
		int sum=a+b+i;
		System.out.println(sum);
	}
	public void addition(float p)
	{
		int sum= a+b+(int)p;
		System.out.println(sum);
	}
	public void addition(int i,int j)
		{
		int sum= a+b+i+j;
		System.out.println(sum);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		
		CompileTimePolymorphism1 obj=new CompileTimePolymorphism1();
		obj.addition(obj.c);
		obj.addition(20.45f);
		obj.addition(obj.c,obj.d);
		
	}

}
