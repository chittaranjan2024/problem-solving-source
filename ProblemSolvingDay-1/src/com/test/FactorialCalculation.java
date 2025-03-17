package com.test;

import java.util.Scanner;

//5!=1*2*3*4*5
public class FactorialCalculation {

	private static int calcFact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)//O(n)
		{
			fact=fact*i;
		}
		
		return fact;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		System.out.println(calcFact(num));

	}

}
