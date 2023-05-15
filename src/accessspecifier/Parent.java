package accessspecifier;  //relation with child.java


public class Parent {
	
	private static void method1()
	{
		System.out.println("parent class of method 1");
	}
	 static void method2()
	{
		System.out.println("parent class of method 2");
	}
	protected static void method3()
	{
		System.out.println("parent class of method 3");
	}

	public static void method4()
	{
		System.out.println("parent class of method 4");
	}
	public void method5()
	{
		System.out.println("parent class of method 5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      method1(); //private method only use same class
      method2(); //default method use in same class and same package
      method3(); //protected method use in diff package with inheritance
      method4(); //public method use in anywhere
      Parent obj=new Parent(); //non sttic method
      obj.method5();
	}

}

