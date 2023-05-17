package Day1;

public class operators {

	public static void main(String[] args) {
		
		
		
		int a=10;
		int b=20;
		
		//Arthematic 
		System.out.println(".................Arthematic operators.................");
		
		System.out.println("sum of a and b is:" + (a+b));
		System.out.println("diff of a and b is:"+(b-a));
		System.out.println("mul of a and b is:"+(a*b));
		System.out.println("div of a and b is:"+ (a/b));
		System.out.println("Mod div of a and b is:"+(a%b) );
		
		
		//Relational 
		System.out.println(".................Relational operators...............");
		
		System.out.println(a==b);//false
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a>=b);//false
		System.out.println(a<=b);//true
		System.out.println(a!=b);//true
		
		
		
		// logical operators
		//works between two boolean value
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(".......................logical operators........");
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		
				
		//Increament operators ++  --
		a=10;
		
		a--;
		
		
		System.out.println(a);


		
		

	}

}
