package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Node root;
	public BinaryTree()
	{
		root=null;
	}
	
	void insert(int key)
	{
		if(root==null)
		{
			root=new Node(key);
			return;
		}
		
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node tmp=queue.poll();
			
			if(tmp.left==null)
			{
				tmp.left=new Node(key);
				break;
			}
			else
			{
				queue.add(tmp.left);
			}
			
			if(tmp.right==null)
			{
				tmp.right=new Node(key);
				break;
			}
			else
			{
				queue.add(tmp.right);
			}
		}
	}
	
	public void preOrder(Node node)
	{
		if(node!=null)
		{
			System.out.print(node.data+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public void postOrder(Node node)
	{
		if(node!=null)
		{
			
			preOrder(node.left);
			preOrder(node.right);
			System.out.print(node.data+" ");
		}
	}
	
	public void inOrder(Node node)
	{
		if(node!=null)
		{
			
			preOrder(node.left);
			System.out.print(node.data+" ");
			preOrder(node.right);
			
		}
	}
	public static void main(String[] args) {
		
		BinaryTree tree=new BinaryTree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		
		System.out.println("Preorder:");
		tree.preOrder(tree.root);
		System.out.println();
		
		System.out.println("Postorder:");
		tree.postOrder(tree.root);
		System.out.println();
		
		System.out.println("Inorder:");
		tree.inOrder(tree.root);
		System.out.println();
	}

}
