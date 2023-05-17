package polymorphism;

public class Child extends Overriding{
	public void bunglow()
	{
		System.out.println("child bunglow 1");
	}
public static void main(String[] args) {
	Overriding p= new Overriding();
	p.bunglow();
	Child c=new Child();
	c.bunglow();
}
}

