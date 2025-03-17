package com.test;

public class PalindromeString {

	public static boolean isPalindrome(String st)
	{
		String rev="";
		for(int i=st.length()-1;i>=0;i--)//O(n)
		{
			rev=rev+st.charAt(i);
		}
		
		if(st.equals(rev))
		{
		   return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		String st="MADAM";
		
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
