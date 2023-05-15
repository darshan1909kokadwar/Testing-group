package superthiskeyword;

public class Child extends Parent {
	int a=100;
	int b=200;
	public void addition()
	{
		int a=1000;
		int b=2000;
		
		System.out.println("Super point to parent global variable:a="+super.a);
		System.out.println("this point to curent class global variable:a="+this.a);
		int sum=super.a+this.b+a;
		int multi=super.b*this.a;
		System.out.println(sum);
		System.out.println(multi);
		
	}


}
