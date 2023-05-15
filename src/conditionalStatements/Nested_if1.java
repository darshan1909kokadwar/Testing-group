package conditionalStatements;

public class Nested_if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=22;
		String gender="female";
		if(age>=18)
		{
			System.out.println("The person is legal voter");
			if(gender=="male" && age>=21)
			{
				System.out.println("The person is eligible for marrige");
			}
			else if(gender=="female")
			{
				System.out.println("The person is eligible for marriage");
				
			}
				
		}
		else
		{
			System.out.println("The person is not legal voter");
		}
	}

}
