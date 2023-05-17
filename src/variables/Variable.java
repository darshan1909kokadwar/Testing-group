package variables;

public class Variable {

	int a=10;
	static int b=20;
	
	public void nonstatic() {
		int c=30;a=10;b=20;
		System.out.println(c+""+a+""+b);
	}
	public static void staticM() {
		int d=40;b=20;
		System.out.println(d);
	}
	public static void main(String[] args) {
		Variable v=new Variable();
		v.nonstatic();
		
		staticM();
		
	}
}
