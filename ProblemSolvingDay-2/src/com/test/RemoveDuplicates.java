package com.test;

import java.util.Arrays;

public class RemoveDuplicates {

	public static int removeDuplicates(int nums[])
	{
		if(nums.length==0)
			return 0;
		
		int i=0;
		for(int j=i+1;j<nums.length;j++)
		{
			if(nums[j]!=nums[i])//found a new unique element
			{
				i++;
				nums[i]=nums[j];//move to the next position
			}
		}
		
		return i+1;//new length after removal
	}
	
	
	
	public static void main(String[] args) {
		
		int nums[]= {1,1,2,2,3,4,4,5};
		
		System.out.println(Arrays.toString(nums));
		System.out.println();
		int length=removeDuplicates(nums);
		
		for(int i=0;i<length;i++)
		{
			System.out.print(nums[i]+",");
		}

	}

}

//Time complexity=O(n)
//Space complexity=O(1)
