package com.test;

public class LongestCommonSubstring {

	
	public static String findLCS(String str1,String str2)
	{
		int m=str1.length();
		int n=str2.length();
		
		int dp[][]=new int[m+1][n+1];
		
		int maxLength=0;
		int endIndex=0;
		
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(str1.charAt(i-1)	==str2.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1]+1;
					if(dp[i][j]>maxLength)
					{
						maxLength=dp[i][j];
						endIndex=i;
					}
				}
				else
				{
					dp[i][j]=0;
				}
			}
		}
		
		
		return str1.substring(endIndex-maxLength,endIndex);
	}
	
	
	public static void main(String[] args) {
		String str1="abcdef";
		String str2="zbcdf";
		
		System.out.println(findLCS(str1, str2));
		
		

	}

}
