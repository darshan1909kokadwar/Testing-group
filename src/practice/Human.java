package practice;

       class Parent{

       int a;
       String str="bat";
	
		public void house()	
		{
			System.out.println(a);

		}
}


class Child extends Parent{
	int b=20;
	public void Display()
	{
		System.out.println(b);
	}
 
}

            public class Human {
	
		public static void main(String[] args) {
			
			
			Parent abc=new Parent();
			abc.a=10;
		
			abc.house();
			System.out.println((abc.str));
			
			Child xyz=new Child();
			
			
		}	
			
			
}
			
			
			
		
		
	


