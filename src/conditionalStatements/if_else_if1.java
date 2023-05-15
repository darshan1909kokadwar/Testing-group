package conditionalStatements;

public class if_else_if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=90;
		if(mark>100 || mark<0)
		{
			System.out.println("Invalid marks please check again");
			
		}
		else if(mark>=75)
		{
			System.out.println("Passed with distinction");
			
		}
		else if(mark>=60)
		{
			System.out.println("Passed with first class");
			
		}
		else if(mark>=50)
		{
			System.out.println("Passed with second class");
			
		}
		else if(mark>=40)
		{
			System.out.println("Passed");
			
		}
		else
		{
			System.out.println("failed");
		}
			
		}

	}


