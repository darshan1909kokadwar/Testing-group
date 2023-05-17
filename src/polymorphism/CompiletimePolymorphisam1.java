package polymorphism;

public class CompiletimePolymorphisam1 {
int a=10;
int b=20;
int c=30;
int d=40;
public void addition()
{
	int sum= a+b;
	System.out.println(sum);
}
public void addition(int i)
{
	int sum= a+b+i;
	System.out.println(i);
}

public void addition(float p)     // p=20.24

{
	int sum=a+b+(int)p;
	System.out.println(sum);
}
public void addition(int i,int j)
{
	int sum=a+b+i+j;
	System.out.println(sum);
	
}
public static void main(String[] args) {
	CompiletimePolymorphisam1 object=new CompiletimePolymorphisam1();
	object.addition();
	object.addition(object.c);
	object.addition(20.24f);
	object.addition(object.c,object.d);
}
}
