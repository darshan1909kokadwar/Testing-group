package practice;
//facabook login
//1.login page
//2.correct username
//3.correct password

public class Nestedif_2 {

	public static void main(String[] args) {

	String url ="https://www.facebook.com/";
	String username="abcxyz";
	String password="abc123";
			
			if (url=="https://www.facebook.com/")
			{
				System.out.println( "user is on login page");
				if (username=="abcxyz")
				{
					System.out.println("valid username");
			if(password=="abc123")
			{
			System.out.println("successfull login");
			
			}		
			else
			{
				System.out.println("invalid passwoed");
			}
				}
			else
			{
				System.out.println("invalid username");
				
			}
			
				}
			
				
			
	}

}
