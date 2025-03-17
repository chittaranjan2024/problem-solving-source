package com.test;

import java.util.Scanner;

//345 = 3+4+5=12
//789= 7+8+9=24
public class SumOfDigits {

	private static int sumCalc(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		System.out.println(sumCalc(num));

	}

}
