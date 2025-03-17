package com.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int arr[]) {
		
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
				int minIndex=i;
				
				for(int j=i+1;j<n;j++)
				{
					if(arr[j]<arr[minIndex])
						minIndex=j;
				}
				
				
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
		}
	}
	
	public static void main(String[] args) {
		int ar[]= {7,9,1,3,32,16,4};
		
		
		System.out.println(Arrays.toString(ar));
		selectionSort(ar);
		System.out.println(Arrays.toString(ar));

	}

}


//O(n*n)
