package com.test;

public class LinkedListCycle {
	
	static class ListNode
	{
		int val;
		ListNode next;
		
		
		public ListNode(int val) {
			this.val=val;
			this.next=null;
		}
	}

	public static boolean hasCycle(ListNode head)
	{
		if(head==null||head.next==null)
		{
			return false;
		}
		
		ListNode fast=head;
		ListNode slow=head;
		
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				return true;
			}
				
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		
		
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		
		//1->2->3->4->5
		
		if(hasCycle(head))
		{
			System.out.println("Cycle detected");
		}
		else
		{
			System.out.println("No Cycle detected");
		}
		
		
		
		head.next.next.next.next.next=head.next;
		
		
		
		if(hasCycle(head))
		{
			System.out.println("Cycle detected");
		}
		else
		{
			System.out.println("No Cycle detected");
		}
		

	}

}
