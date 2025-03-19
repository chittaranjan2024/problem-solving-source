package com.test;
class QueueArray
{
	private int rear,front,size;
	private int capacity;
	private int queue[];
	
	
	public QueueArray(int capacity)
	{
		this.capacity=capacity;
		front=0;
		rear=capacity-1;
		size=0;
		queue=new int[capacity];
	}
	
	public boolean isFull()
	{
		return size==capacity;
	}
	
	
	public boolean isEmpty()
	{
		return size==0;	
	}
	
	
	public void enqueue(int data)//O(1)
	{
		if(isFull())
		{
			System.out.println("Queue is full!");
			return;
		}
		
		rear=(rear+1)%capacity;
		queue[rear]=data;
		size++;
		System.out.println(data + " enqueued");
	}
	
	
	public int dequeue()//O(1)
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty!");
			return -1;
		}
		
		int item=queue[front];
		front=(front+1)%capacity;	
		size--;
		return item;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}
	
	
	
	
}
public class QueueImplementationUsingArray {

	public static void main(String[] args) {
		
		QueueArray queueArray=new QueueArray(5);
		
		queueArray.enqueue(11);
		queueArray.enqueue(22);
		queueArray.enqueue(33);
		queueArray.enqueue(44);
		queueArray.enqueue(55);
		
		System.out.println(queueArray.dequeue());
		System.out.println(queueArray.dequeue());
		System.out.println(queueArray.getFront());
		System.out.println(queueArray.getRear());
	}

}
//space complexity=O(n)