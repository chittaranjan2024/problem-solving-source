package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensProblem {
	
	private static List<String> constructBoard(char[][] board)
	{
		List<String> result=new ArrayList<String>();
		for(char [] row:board)
		{
			result.add(new  String(row));
		}
		
		return result;
	}
	
	
	private static void printSolution(List<List<String>> solutions)
	{
		for(List<String> solution:solutions)
		{
			for(String  row:solution)
			{
				System.out.println(row);
				
			}
			
			System.out.println();
		}
	}
	
	
	private static boolean isSafe(char[][] board,int row,int col)
	{
		int n=board.length;
		
		for(int i=0;i<row;i++)//check column
		{
			if(board[i][col]=='Q')
				return false;
		}
		
		
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)//upper left diagonal
		{
			if(board[i][j]=='Q')
				return false;
		}
		
		for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++)//upper right diagonal
		{
			if(board[i][j]=='Q')
				return false;
		}
		
		return true;
		
	}
	
	
	private static void backtract(char[][] board, int row,List<List<String>> solutions)
	{
		int n=board.length;
		
		if(n==row)
		{
			solutions.add(constructBoard(board));
			return;
		}
		
		for(int col=0;col<n;col++)
		{
			if(isSafe(board, row, col))
			{
				board[row][col]='Q';
				backtract(board, row+1, solutions);
				board[row][col]='.';//backtrack
			}
		}
	}
	
	private static void solveNQueens(int n)
	{
		char[][] board=new char[n][n];
		for(char[] 	row:board)
		{
			Arrays.fill(row, '.');
		}
		
		List<List<String>> solutions=new ArrayList<List<String>>();
		backtract(board, 0, solutions);
		printSolution(solutions);
			
	}
	
 public static void main(String[] args) {
		
		int n=6;
		solveNQueens(n);
		
	}

}
