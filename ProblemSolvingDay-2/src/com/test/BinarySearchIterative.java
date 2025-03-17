package com.test;

import java.util.Arrays;

public class BinarySearchIterative {

	public static int binarySearch(int arr[],int target)
	{
		int left=0;//O(1)
		int right=arr.length-1;//O(1)
		
		while(left<=right)
		{
			int mid=left+(right-left)/2; //to avoid integer overflow
			
			if(arr[mid]==target)
			{
				return mid;
			}
			
			if(target>arr[mid])
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}

		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {14,67,94,345,876,976};//O(1)
		Arrays.sort(arr);
		
		
		int target=11;//O(1)
		int result=binarySearch(arr, target);
		if(result==-1)
		{
			System.out.println("Element not present!");
		}
		else
		{
			System.out.println("Element present at "+result+" index");
		}

	}

}

//Time complexity=O(logn)
//Space complexity=O(1)