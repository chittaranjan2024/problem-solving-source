package com.test;

public class StringCompression {

	public static String compressString(String str)
	{
		if(str==null||str.length()==0)
		{
			return str;
		}
		
		StringBuilder compressed=new StringBuilder();
		int count=1;//counts the occurrences of each character
		
		for(int i=0;i<str.length();i++)
		{
			if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
			else
			{
				compressed.append(str.charAt(i)).append(count);
				count=1;
				
			}
		}
		
		return compressed.length()<str.length()?compressed.toString():str;
	}
	
	public static void main(String[] args) {
		String input="aabbcc";
		
		System.out.println(compressString(input));
		

	}

}
