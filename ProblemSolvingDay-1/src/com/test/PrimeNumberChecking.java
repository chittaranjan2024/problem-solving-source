package com.test;

import java.util.Scanner;

public class PrimeNumberChecking {

	private static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
	
		
		for(int i=2;i<=Math.sqrt(num);i++)  //O(vN)
		{ 
			if(num%i==0)
				return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		if(isPrime(num))
		{
			System.out.println(num+" is a Prime Number");
		}
		else
		{
			System.out.println(num+" is not a Prime Number");
		}
		
		
	
	}

}
