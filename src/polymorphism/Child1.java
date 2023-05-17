 package polymorphism;

public class Child1  extends Parent{

	
	public void marry()
	{
		System.out.println("maary 2");
	}
	public static void main(String[] args) {
		

		
		
		Child1 c= new Child1();
		c.marry();
		Parent p=new Child1();
		p.marry();
		
		
	}
	
}
