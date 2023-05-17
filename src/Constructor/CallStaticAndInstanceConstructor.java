package Constructor;

public class CallStaticAndInstanceConstructor {

	static int a;  //static constructor
	
	char b;        //instance constructor   
	
	public static void main(String args[]) {
		System.out.println(a);
		CallStaticAndInstanceConstructor D=new CallStaticAndInstanceConstructor();
		System.out.println(D.b);
	}
}
