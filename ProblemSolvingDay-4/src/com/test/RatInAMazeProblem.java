package com.test;

public class RatInAMazeProblem {

	static int N;
	public static boolean isSafe(int maze[][],int x,int y)
	{
		return (x>=0 && x<N && y>=0 && y<N && maze[x][y]==1);
	}
	
	static void printSolution(int sol[][])
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	static boolean  solveMazeUntil(int maze[][],int x,int y,int sol[][])
	{
		if(x==N-1 && y==N-1)//base case : if destination is reached
		{
			sol[x][y]=1;
			return true;
		}
		
		if(isSafe(maze, x, y))//check if x,y is a valid move
		{
			sol[x][y]=1;
			
			if(solveMazeUntil(maze, x, y+1,sol))//moving right
				return true;
			if(solveMazeUntil(maze, x+1, y,sol))//moving down
				return true;
			
			sol[x][y]=0;//if none of the moves work, backtrack
		}
		
		return false;
		
		
	
	}
	
	
	static boolean solveMaze(int maze[][])
	{
		N=maze.length;
		int sol[][]=new int[N][N];
		
		if(!solveMazeUntil(maze, 0, 0,sol))
		{
			System.out.println("No path exist!");
			return false;
		}
		
		
		printSolution(sol);
		return true;
		
	}
	
	public static void main(String[] args) {
		
		int maze[][]= {
				{1,0,0,0},
				{1,1,0,1},
				{0,1,0,0},
				{1,1,1,1}
		};
		
		solveMaze(maze);
	}

}
