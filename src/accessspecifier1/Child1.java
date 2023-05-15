package accessspecifier1; //relation with diff package parent.java
import accessspecifier.Parent;

public class Child1 extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Parent.method3(); //we can call protected method from different package with differnce class using inheritance
      
       Parent.method4(); //public method from diff pckage diff class
	}

}
