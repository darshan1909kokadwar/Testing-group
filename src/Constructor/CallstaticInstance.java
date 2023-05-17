package Constructor;

public class CallstaticInstance {

	static int a;
	
	int b;
	
	public static void method() {
		a=10;
	}
	public void method2() {
		b=20;
	}
	
	public static void main(String[] args) {
	 CallstaticInstance.method();
	 System.out.println(a);
	 
	
	 CallstaticInstance S=new CallstaticInstance();
	 S.method2();
	 System.out.println(S.b);
	 
	
	 
	}
	
}
