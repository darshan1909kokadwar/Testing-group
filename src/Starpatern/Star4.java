package Starpatern;
//*
//**
//***
//****
//*****
//******
//*****
//****
//***
//**
//*

public class Star4 {
	public static void main(String[] args) {
		//1st part
		for(int i=1;i<=6;i++)  //row
		{
			for(int j=1; j<=i;j++)	//characters in a row
			{
			System.out.print("*");
			}
		System.out.println();
		}
		//2nd part
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
