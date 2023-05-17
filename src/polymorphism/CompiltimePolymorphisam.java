package polymorphism;

public class CompiltimePolymorphisam {
int a=10;
int b=20;
public void addition() // method declaration

{
	int sum=a+b;
	System.out.println(sum);       //method definition compile time polymorphisam
}
public void addition(int i)
{
	
}
public void addition(float p)
{
	System.out.println(p);
}
public static void main(String[] args) {
	
	CompiltimePolymorphisam object=new CompiltimePolymorphisam();
	object.addition();
}
}
