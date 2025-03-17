package com.test;

import java.util.Arrays;

public class BinarySearchRecursive {

	public static int binarySearch(int arr[],int left,int right,int target)
	{
		if(left>right)
			return -1;
		int mid=left+(right-left)/2;
		
		if(arr[mid]==target)
		{
			return mid;
		}
		else if(arr[mid]<target)
		{
			return binarySearch(arr,mid+1,right,target);
		}
		else
		{
			return binarySearch(arr,left,mid-1,target);
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {14,67,94,345,876,976};//O(1)
		Arrays.sort(arr);
		
		
		int target=14;//O(1)
		int result=binarySearch(arr, 0,arr.length-1,target);
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
//Space complexity=O(logn)
