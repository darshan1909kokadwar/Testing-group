package practice;
import differentpackage.Animal;
public class Staticmethods {

	public static void main(String[] args) {
	System.out.println("main method execution starts");
	
	           method1();
	           method2();
	           method1();
	           Differentclass.method3();
	           Differentclass.method4();
	           Animal.method5();
	           Animal.method6();
	           
	           //object creation syntax
	           //classname objectname=new classname()
	           //for method call:objectname.methodname()
	           
                Staticmethods abc = new Staticmethods();
                abc.method7();
                
		         Differentclass pqr= new Differentclass();
                pqr.method8();
                
                Animal xyz=new Animal();
                xyz.method9();
		          
		          
		          
	           
	
	
	
	System.out.println("main method execution ends");
	
	}
       public static void method1()
       {
    	   System.out.println("static method1 from same clas");
    	  
       }
       
       public static void method2()
       {
    	   System.out.println("static method2 from same class");
       }
    	   
         public void method7()
         {
        	 System.out.println("non static method7");
         }
         
    	   
    	  
    	   
    	   
    	   
    	   
    	   
       }
	


