package com.test;

public class FactorialUsingRecursiveApproach {

	public static int factorial(int n)//5
	{
		if(n==0 || n==1)//base condition
		{
			return 1;
		}
		
		
		return n*factorial(n-1);//recursive calls
	}
	
	
	public static void main(String[] args) {
		int num=5;
		
		System.out.println(factorial(num));

	}

}
