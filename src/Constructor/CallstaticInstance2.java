package Constructor;

public class CallstaticInstance2 {

	int a=10;
	int b=20;
	
	static String c ="ayesha";
	static String d ="khan";
	
	public static void main(String[] args) {
	
		CallstaticInstance2 s=new CallstaticInstance2();
		System.out.println(s.a);
		System.out.println(s.b);
		
		System.out.println(c+" "+d);
	}
}
