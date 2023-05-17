package superthis;

public class Child extends Parent {
	int a=100;
	int b=200;
	
public void addition()
{
	int a=1000;
	int b=2000;
	System.out.println(this.a);
	System.out.println(super.a);
	int sum=this.a+a;
	System.out.println(sum);
}
public static void main(String[] args) {
  Child c =new Child();
  c.addition();
}
}
