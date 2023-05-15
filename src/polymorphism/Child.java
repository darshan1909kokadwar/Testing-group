package polymorphism;  ///run time polymorphusm

public class Child extends Parent{
	public void Bunglow()
	{
		System.out.println("child bunglow=2");
	}
	public void Farm()
	{
		System.out.println("child farm=5 hector");
	}
	public void Bike()
	{
		System.out.println("child bike=4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Child c=new Child();
       c.Bike();//only child
       c.Bunglow();//parent-child
       c.Farm();//parent-child
       
       Parent p=new Parent();
       //p.Bunglow();
       p.Car();//only car
      // p.Farm();
	}

}
