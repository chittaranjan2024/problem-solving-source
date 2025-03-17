package com.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[])
	{
	   int n=arr.length;
	   boolean swapped;
	   for(int i=0;i<n;i++)
	   {
		   swapped=false;
		   for(int j=0;j<n-i-1;j++)
		   {
			   if(arr[j]>arr[j+1])
			   {
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
				   
				   swapped=true;
			   }
		   }
		   
		   if(!swapped) break;
	   }
	}
	
	public static void main(String[] args) {
		
		int ar[]= {7,9,1,3,32,16,4};
		
		
		System.out.println(Arrays.toString(ar));
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
		

	}

}

//O(n*n)
//O(n)