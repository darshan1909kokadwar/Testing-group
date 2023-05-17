package oops;

public class Final extends Parent {

	public static void main(String[] args) {

		 Child1 xyz =new Child1();  
         System.out.println((xyz.a));
         System.out.println((xyz.b)); 
        xyz.bike();
        xyz.house();
        Child2 abc= new Child2();
    	System.out.println((abc.a));
    	System.out.println((abc.b));
        abc.bike();
        abc.house();
		
		
		

	}

}
