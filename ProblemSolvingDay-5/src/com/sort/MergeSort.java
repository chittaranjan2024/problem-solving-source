package com.sort;

import java.util.Arrays;

public class MergeSort {
	
	private static void merge(int arr[],int left,int mid,int right)
	{
		int n1=mid-left+1;//size of the left sub-array
		int n2=right-mid;//size of the right sub-array
		
		int leftSubarray[]=new int[n1];
		int rightSubarray[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			leftSubarray[i]=arr[left+i];
		}
		
		for(int j=0;j<n2;j++)
		{
			rightSubarray[j]=arr[mid+1+j];
		}
		
		
		int i=0,j=0,k=left;
		
		while(i<n1 && j<n2)
		{
			if(leftSubarray[i]<=rightSubarray[j])
			{
				arr[k]=leftSubarray[i];
				i++;
			}
			
			else
			{
				arr[k]=rightSubarray[j];
				j++;
			}
			
			k++;
		}
		
		//copy the remaining elements from the right sub-array
		while(i<n1)
		{
			arr[k]=leftSubarray[i];
			i++;
			k++;
		}
		//copy the remaining elements from the left sub-array
		while(j<n2)
		{
			arr[k]=rightSubarray[j];
			j++;
			k++;
		}
	}
	
	
	private static void mergeSort(int arr[],int left,int right)
	{
		if(left<right)
		{
			int mid=left+(right-left)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			
			merge(arr,left,mid,right);
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {38,27,43,3,9,82,10};
		
		System.out.println(Arrays.toString(arr));
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}

//Time complexity: O(nlogn)
//Space complexity: O(n)
