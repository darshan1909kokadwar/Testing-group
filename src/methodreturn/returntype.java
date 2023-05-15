package methodreturn; //method with zero parameter

public class returntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    addition();
    returntype obj1 = new returntype();
    obj1.substract();
	}
	
	public static void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
			
	}
	public void substract()
	{
		int a=10;
		int b=20;
		int sub=b-a;
		System.out.println(sub);
			
	}

}
