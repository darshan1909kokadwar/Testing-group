package Day1;

public class Parameter33 {
	public static void main(String[] args) {
		
		int a=30;
		int b=40;
		
		Parameter33 xyz=new Parameter33();
			xyz.addition(a,b); 	
			xyz.subtraction(a,b);
			xyz.multiplication(a,b);
			xyz.division(a,b);
	}
		public  void addition(int i,int j)
		{
		int add=i+j;
		System.out.println(add);
		
		}
		
		public void multiplication(int i,int j)
		{
		int mul=i*j;
		System.out.println(mul);
		}
	    
		public void subtraction(int i,int j)
		{
		int sub=i-j;
		System.out.println(sub);
		}
		
		public void division(int i,int j)
		{
		int divi=j/i;
		System.out.println(divi);
		}
		
	

}
