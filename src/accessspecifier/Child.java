package accessspecifier;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Parent.method2(); //call method from child class
      Parent.method3(); //call method from child class
      Parent.method4(); //call method from child class
      Child c=new Child();
      c.method5();
	}

}
