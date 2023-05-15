package Starpatern;
//     *
//     **
//     ***
//     ****
//     *****
//     ******
//*****
//****
//***
//**
//*



public class Star8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++)  //row
		{
			for(int j=5; j>=1;j--)	//characters in a row
			{
			System.out.print(" ");
			}
			for(int k=1; k<=i;k++)	//characters in a row
			{
			System.out.print("*");
			}
		System.out.println();
		}
	
	for(int i=1; i<=5;i++)	//characters in a row
	{

	for(int j=5; j>=i;j--)	//characters in a row
	{
	System.out.print("*");
	}
	System.out.println();
}

}
}
