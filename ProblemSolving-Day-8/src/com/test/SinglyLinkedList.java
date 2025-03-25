package com.test;

public class SinglyLinkedList {
	private Node head;//Reference to the first node
	
	public void insertAtBeginning(int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;//New node points to the old head
		head=newNode;//Head now points to the new node
	}
	
	public void insertAtEnd(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)//If the list is empty
		{
			head=newNode;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=newNode;
		
	}
	
	
	public void insertAtPosition(int data,int position)
	{
		Node newNode=new Node(data);
		
		if(position==1)
		{
			newNode.next=head;
			head=newNode;
			return;
		}
		
		Node temp=head;
		for(int i=1;i<position-1 && temp!=null;i++)
		{
			temp=temp.next;
		}
		
		
		if(temp==null)
		{
			System.out.println("Position is out of range");
			return;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
			
	}
	
	
	public void deleteAtBeginning()
	{
		if(head==null)
			return;
		
		head=head.next;
	}
	
	public void deleteAtEnd()
	{
		if(head==null)//empty list
			return;
		
		if(head.next==null)//one node only
		{
			head=null;
			return;
		}
		
		Node temp=head;
		while(temp.next.next!=null)//traverse to the second last node
		{
			temp=temp.next;
		}
		
		temp.next=null;
		
	}
	
	public void deleteAtPosition(int position)
	{
		if(head==null)//empty list
			return;
		
		if(position==1)
		{
			head=head.next;
			return;
		}
		
		Node temp=head;
		
		for(int i=1;temp!=null && i<position-1;i++)
		{
			temp=temp.next;
		}
		
		
		if(temp==null || temp.next==null) 
			return;
		
		temp.next=temp.next.next;
	}
	
	public boolean search(int key)
	{
		Node temp=head;
		
		while(temp!=null)
		{
			if(temp.data==key)
			{
				return true;
			}
			
			temp=temp.next;
		}
		
		return false;
	}
	
	
	public void reverse()
	{
			Node pre=null,current=head,next=null;
			
			while(current!=null)
			{
				next=current.next;
				current.next=pre;
				pre=current;
				current=next;
			}
			
			head=pre;
	}
	
	public void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		
		System.out.println("Null");
	}
	
	public static void main(String[] args) {
		
		SinglyLinkedList list=new SinglyLinkedList();
		
		list.insertAtBeginning(11);
		list.insertAtEnd(66);
		list.insertAtPosition(1, 56);
		list.insertAtBeginning(3);
		
		list.printList();
		
		//list.deleteAtBeginning();
		//list.printList();
		
		list.reverse();
		
		list.printList();
		
		System.out.println(list.search(11));
		

	}

}

//Time complexity : Insert/Delete at the beginning: O(1)
// All other operation: O(n)
