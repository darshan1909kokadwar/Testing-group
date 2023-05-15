package Starpatern;
//    *
//   **
//  ***
// ****
//*****
//star=5; space= 4, rows=5


public class Star5 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) //rows
		{
			for(int j=4;j>=i;j--) //spaces
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) //star
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
