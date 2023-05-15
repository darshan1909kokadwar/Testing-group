package polymorphism;//method overloading

public class CompileTimePolymorphism {
	int a=10;
	int b=20;
	int c=30;
	int d=40;
	
	public void addition()
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
		CompileTimePolymorphism obj=new CompileTimePolymorphism();
		obj.addition();
		obj.addition(obj.c);
		obj.addition(20.45f);
		obj.addition(obj.c,obj.d);
		
	}

}
