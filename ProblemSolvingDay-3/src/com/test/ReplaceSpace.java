package com.test;

public class ReplaceSpace {

	
	public static String replace(String str,char ch)
	{
		String updated="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				updated=updated+ch;
				continue;
			}
			updated=updated+str.charAt(i);
			
		}
		
		return updated;
	}
	
	
	public static void main(String[] args) {
		String str="Welome to Java";
		char ch='-';
		
		System.out.println(replace(str, ch));

	}

}
