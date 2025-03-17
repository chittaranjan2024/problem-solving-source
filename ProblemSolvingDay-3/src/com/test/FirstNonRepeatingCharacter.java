package com.test;

public class FirstNonRepeatingCharacter {

	public static char findFirstNonRepeatingCharacter(String str)
	{
		int charCounts[]=new int[256];//assuming extended ASCII
		
		//count the occurrences of each character
		for(char ch:str.toCharArray())
		{
			charCounts[ch]++;
		}
		
		
		for(char ch:str.toCharArray())
		{
			if(charCounts[ch]==1)
			{
				return ch;
			}
		}
		
		return '-';
		
	}
	
	public static void main(String[] args) {
		
		String input="swiss";//w
		
		System.out.println(findFirstNonRepeatingCharacter(input));
		

	}

}
