package com.test;

/*class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}*/

public class QueueImplementationUsingLinkedList {
	
	private Node front,rear;
	
	
	public QueueImplementationUsingLinkedList()
	{
		this.front=this.rear=null;
	}
	
	
	public void enqueue(int data)//O(1)
	{
		Node newNode=new Node(data);
		if(rear==null)
		{
			front=rear=newNode;
			return;
		}
		
		rear.next=newNode;
		rear=newNode;
		System.out.println(data+" enqueued");
		
		
	}
	
	public int dequeue()//O(1)
	{
		if(front==null)
		{
			System.out.println("Queue is empty!");
			return -1;
		}
		
		int item=front.data;
		front=front.next;
		if(front==null) rear=null;
		
		return item;
	}
	
	
	

	public static void main(String[] args) {
		
		QueueImplementationUsingLinkedList queue=new QueueImplementationUsingLinkedList();
		queue.enqueue(11);
		queue.enqueue(22);
		queue.enqueue(33);
		queue.enqueue(44);
		queue.enqueue(55);
		queue.enqueue(66);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
//Time complexity:O(1)
//space complexity:O(N)