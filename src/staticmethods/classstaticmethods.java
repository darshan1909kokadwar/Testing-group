package staticmethods;

import method.method4; //call from different packages

public class classstaticmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello method");
		method1();
		method2();
		staticmethod1.method3();//call from different class
		method4.method5();
	}
public static void method1()
{
	System.out.println("static method1");
	}
public static void method2()
{
	System.out.println("static method2");
}
	

}

