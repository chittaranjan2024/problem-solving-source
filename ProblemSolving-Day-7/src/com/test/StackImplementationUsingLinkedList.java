package com.test;
class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class StackImplementationUsingLinkedList {

	private Node top;
	
	public StackImplementationUsingLinkedList()
	{
		this.top=null;
	}
	
	public void push(int x)
	{
		Node newNode=new Node(x);
		newNode.next=top;//LIFO
		
		top=newNode;
		
		System.out.println(x +" pushed to Stack");
		
	}
	
	public int pop()
	{
		if(top==null)
		{
			System.out.println("Stack is empty!!");
			return -1;
		}
		
		int popped=top.data;
		top=top.next;
		return popped;
	}
	
	
	public int peek()
	{
		if(top==null)
		{
			System.out.println("Stack is empty!!");
			return -1;
		}
		
		return top.data;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	
	public static void main(String[] args) {
		StackImplementationUsingLinkedList stack=new StackImplementationUsingLinkedList();
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.push(55);
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
	}

}
