package com.tree;

public class BST {
	
	Node root;
	
	public BST()
	{
		root=null;
	}
	
	
	public Node insert(Node root,int key)
	{
		if(root==null )
		{
			return new Node(key);
		}
		
		if(key<root.data)
		{
			root.left=insert(root.left,key);
		}
		else if(key>root.data)
		{
			root.right=insert(root.right, key);
		}
		
		return root;
		
		
	}
	
	//wrapper function for inserting
	public void insert(int key)
	{
		root=insert(root,key);
	}
	
	public void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	public void inOrder()
	{
		inOrder(root);
		System.out.println();
	}
	
	
	public Node delete(Node root,int key) {
		if(root==null)
		{
			return root;
		}
		
	    if(key<root.data)
	    {
	    	root.left=delete(root.left,key);
	    }
	    else if(key>root.data)
	    {
	    	root.right=delete(root.right, key);
	    }
	    else
	    {
	    	//case 1 & 2:Node with only one child or no child
	    	if(root.left==null) return root.right;
	    	else if(root.right==null) return root.left;
	    	
	    	//case3: Node with two children
	    	
	    	root.data=minValue(root);
	    	
	    	root.right=delete(root.right, root.data);
	    	
	    }
	    
	    
	    return root;
   
	}
	
	
	public void delete(int key)
	{
		root=delete(root, key);
	}
	
	
	   private int minValue(Node root)
	    {
	    	int min=root.data;
	    	while(root.left!=null)
	    	{
	    		root=root.left;
	    		min=root.data;
	    	}
	    	
	    	return min;
	    }
	   
	   
	   public Node search(Node root,int key)
	   {
		   if(root==null||root.data==key)
		   {
			   return root;
		   }
		   
		   
		   if(key<root.data)
		   {
			   return search(root.left,key);
		   }
		   
		   return search(root.right,key);
		   
	   }
	   
	   
	   public boolean search(int key)
	   {
		   return search(root,key)!=null;
	   }

	public static void main(String[] args) {
	
		
		BST bst=new BST();
		bst.insert(12);
		bst.insert(3);
		bst.insert(67);
		bst.insert(23);
		bst.insert(77);
		bst.insert(123);
		bst.insert(5);
		
		System.out.println("Inorder traversing...");
		bst.inOrder();

	   bst.delete(23);
	   
	   System.out.println("Inorder traversing...");
		bst.inOrder();
		
		
		if(bst.search(77))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("Not present");
		}
	}

}

