package com.test;

public class PalinndromeCheckingUsingTwoPointers {

	public static boolean isPalindrome(String st)
	{
		int left=0,right=st.length()-1;
		
		while(left<right)
		{
			if(st.charAt(left)!=st.charAt(right))
			{
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String st="racecar";
		
		if (isPalindrome(st)) 
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Non-palindrome");
		}

	}

}
