package Starpatern;
//     *
//    **
//   ***
//  ****
// *****
//******
// *****
//  ****
//   ***
//    **
//     *

public class Star7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++)  //row
		{
			for(int j=5; j>=i;j--)	//characters in a row
			{
			System.out.print(" ");
			}
			for(int k=1; k<=i;k++)	//characters in a row
			{
			System.out.print("*");
			}
		System.out.println();
		}
		//2nd part
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++)	//characters in a row
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
