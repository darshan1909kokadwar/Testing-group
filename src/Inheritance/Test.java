package Inheritance;

public class Test {
	public static void main(String[] args) {
		
		
		
		Parent p=new Parent();
		//p.farm();
		p.bunglow();
		System.out.println(p.a);
		Child c=new Child();
		c.iphone();
		System.out.println(c.a);
		System.out.println(c.b);
		c.bunglow();
}
}