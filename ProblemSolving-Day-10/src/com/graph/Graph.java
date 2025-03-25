package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Graph {

	private Map<Integer, List<Integer>> adjList;
	
	public Graph()
	{
		this.adjList=new HashMap<Integer, List<Integer>>();
	}
	//add a vertex
	public void addVertex(int v)
	{
		adjList.putIfAbsent(v, new ArrayList<>());
	}
	
	public void addEdge(int v1,int v2)
	{
		adjList.get(v1).add(v2);
		adjList.get(v2).add(v1);
	}
	
	private void dfsRecursive(int node,Set<Integer> visited)
	{
		if(visited.contains(node))
		{
			return;
		}
		
		visited.add(node);
		System.out.print(node+" ");
		for(int neighbor:adjList.get(node))
		{
			dfsRecursive(neighbor, visited);
		}
	}
	
	
	public void dfs(int start)
	{
		Set<Integer> visited=new HashSet<Integer>();
		System.out.println("DFS:");
		dfsRecursive(start, visited);
		System.out.println();
	}
	
	
	public void bfs(int start)
	{
		Set<Integer> visited=new HashSet<Integer>();
		Queue<Integer> queue=new LinkedList<Integer>();
		
		
		queue.add(start);
		visited.add(start);
		
		
		System.out.println("BFS:");
		while(!queue.isEmpty())
		{
			int node=queue.poll();
			System.out.print(node+" ");
			
			for(int neighbor:adjList.get(node))
			{
				if(!visited.contains(neighbor))
				{
					queue.add(neighbor);
					visited.add(neighbor);
				}
			}
		}
		
		System.out.println();
	}
	public static void main(String[] args) {
		
		Graph graph=new Graph();
		
		for(int i=1;i<=6;i++)
		{
			graph.addVertex(i);
		}
		
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(2, 5);
		graph.addEdge(3, 6);
		
		graph.dfs(1);
		graph.bfs(1);

	}

}
