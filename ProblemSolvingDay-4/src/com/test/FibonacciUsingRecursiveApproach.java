package com.test;
//0 1 1 2 3...
public class FibonacciUsingRecursiveApproach {

	public static int fibonacci(int n)
	{
		//base case
		if(n==0) return 0;
		if(n==1)return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static void display(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(fibonacci(i)+" ");
		}
	}
	
	public static void main(String[] args) {
		
      int terms=10;

      display(10);
	}

}
