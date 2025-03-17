package com.test;

import java.util.Scanner;

//0 1 1 2 3 5 8 ........
public class FibonacciSeries {

	private static void fibo(int num)
	{
		int ft=0,st=1;
		
		for(int i=1;i<=num;i++)// O(n)
		{
			System.out.print(ft+" ");
			
			int nt=ft+st;
			ft=st;
			st=nt;
			
		}
	}
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		fibo(num);
		
	}

}


//Space complexity : O(1)
//Time complexity: O(n)
