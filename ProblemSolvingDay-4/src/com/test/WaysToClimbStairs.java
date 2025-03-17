package com.test;

public class WaysToClimbStairs {

	public static int climbStairs(int n)
	{
		if(n<=2)
		{
			return n;
		}
		
		return climbStairs(n-1)+climbStairs(n-2);
		//f(n) - f(n-1)+f(n-2)  -O(2^n)
		//f(n-1) - ways to reach n by taking 1 step from n-1
		//f(n-2) - ways to reach n by taking 2 step from n-2
	}
	
	
	public static void main(String[] args) {
		
		int n=5;	
		System.out.println(climbStairs(n));
	}

}
