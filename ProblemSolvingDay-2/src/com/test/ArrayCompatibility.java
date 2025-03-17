package com.test;

import java.util.Arrays;

public class ArrayCompatibility {

	public static boolean areComatible(int ar1[],int ar2[])
	{
		if(ar1.length!=ar2.length)
			return false;
		
		
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]<ar2[i])
				return false;
		}
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		return Arrays.equals(ar1, ar2);
	}
	
	
	
	public static void main(String[] args) {
		
		int ar1[]= {2,1,3,4};
		int ar2[]= {2,1,3,4};
		
		System.out.println(areComatible(ar1, ar2));
		

	}

}
