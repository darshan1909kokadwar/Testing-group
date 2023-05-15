package conditionalStatements;

public class Nested_if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int physicsMarks=30,chemistryMarks=30,MathMarks=30;
		if(physicsMarks>=40)
		{
			System.out.println("Pass in physics");
			if(chemistryMarks>=40)	
			{
				System.out.println("Pass in chemistry");
				if(MathMarks>=40)	
				{
					System.out.println("Pass in Math");
					System.out.println("Pass in exam");
				}
				
		}
		}
			else 
			{
				System.out.println("fail in exam");
			
	}
	}
}



