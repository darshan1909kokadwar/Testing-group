package Inheritance;

public class ClassA {
 public void method() 
 {
 
	System.out.println("method of class a");
 }
}
 
 class ClassB extends ClassA
 {
	public void method2() 
	{
		System.out.println("METHOD OF CLASS B");
	}
 }
class ClassC extends ClassA
{
public void method3()
{
	System.out.println("method3");
	
}
}
class ClassD extends ClassA
{
public void method4()
{
	System.out.println("method 4");
}
}

 
 

