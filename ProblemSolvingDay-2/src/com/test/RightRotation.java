package com.test;

import java.util.Arrays;

public class RightRotation {

	public static void reverse(int arr[],int start,int end)
	{
		while(start<end)  //O(n)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
	}
	
	
	public static void rotateArray(int arr[],int k)
	{
		int n=arr.length;
		k=k%n;
		
		reverse(arr, 0, n-1);//reverse the entire array 
		reverse(arr, 0, k-1);//reverse first k elements
		reverse(arr, k, n-1);//reverse the remaining elements
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};//O(1)
		int k=3;//O(1)
		
		System.out.println(Arrays.toString(arr));
		
		rotateArray(arr, k);
		
		System.out.println(Arrays.toString(arr));
	}

}
