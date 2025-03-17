package com.test;

public class FactorialUsingIterativeApproach {

	public static long factCalculation(int n)
	{
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		
		System.out.println( factCalculation(5) );
	}

}
