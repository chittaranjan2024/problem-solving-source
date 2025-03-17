package com.test;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		String st=scanner.nextLine();
		
		st=st.toLowerCase();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
