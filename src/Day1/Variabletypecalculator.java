package Day1;

public class Variabletypecalculator {

	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	
	public static void addition()
	{
		int e=50;
		int f=60;
		int sum;
		sum=e+f+c+d;
		System.out.println(sum);
	}
		public void multiplication() {
			
		int g=70;
		int h=80;
		int multi;
		multi=g*h*a*b*c*d;
			System.out.println(multi);
			
		}
		
		public static void main(String[] args) {
			Variabletypecalculator object=new Variabletypecalculator();
			
			object.multiplication();
			object.addition();
			
		}
	
	
	
}
