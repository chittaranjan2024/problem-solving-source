package com.test;

import java.util.Arrays;

public class StringAnagram {

	public static boolean isAnagram(String s1,String s2)
	{
		s1=s1.replace("\\s", "").toLowerCase();
		s2=s2.replace("\\s", "").toLowerCase();
		
		if(s1.length()!=s2.length())
			return false;
		
		char charArray1[]=s1.toCharArray();
		char charArray2[]=s2.toCharArray();
		
		//O(nlogn)
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1,charArray2);//O(n)
	}
	
	public static void main(String[] args) {
		
		String st1="LISTEN";
		String st2="SILENT";
		
		if(isAnagram(st1, st2))
		{		
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Non-Anagram");
		}
		

	}

}

//Overall complexity=O(nlogn)
