package com.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int arr[])
	{
		int n=arr.length;
		
		for(int i=1;i<n;i++)
		{
			int key=arr[i];//current element to be inserted
			int j=i-1;
			
			//shift elements of the sorted part to the riight
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=key;	//insert the key in the correct position		
		}
	}
	public static void main(String[] args) {
		int ar[]= {7,9,1,3,32,16,4};
		
		
		System.out.println(Arrays.toString(ar));
		insertionSort(ar);
		System.out.println(Arrays.toString(ar));

	}

}

//O(n*n)
