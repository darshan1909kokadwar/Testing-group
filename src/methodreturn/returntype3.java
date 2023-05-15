package methodreturn;

public class returntype3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x=addition();  //or addition();
     int y=substract();  //  substract();
     div();
     int multi=x*y;
     System.out.println(multi);
     }
	public static int addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
	public static int substract()
	{
		int c=10;
		int d=20;
		int sub=d-c;
		System.out.println(sub);
		return sub;
	}
	public static String div()
	{
		String s="Name";
		System.out.println(s);
		return s;
	}

}
