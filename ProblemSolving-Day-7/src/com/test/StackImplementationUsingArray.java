package com.test;
class StackArray
{
	private int stack[];
	private int top;
	private int capcity;
	
	
	public StackArray(int size)
	{
		stack=new int[size];
		capcity=size;
		top=-1;	
	}
	
	
	//push operation
	
	public void push(int x)
	{
		if(top==capcity-1)
		{
			System.out.println("Stack Overflow!!");
			return;
		}
		
		stack[++top]=x;
		System.out.println(x+" pushed to the stack");
	}
	
	
	//pop operation
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow!!");
			return -1;
		}
		
		return stack[top--];
	}
	
	public int peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty!!");
			return -1;
		}
		
		return stack[top];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public int size()
	{
		return top+1;
	}
	
	public void stackPrint()
	{
		for(int i=0;i<=top;i++)
		{	
			System.out.print(stack[i]+" ");
		}
		
		System.out.println();
	}
	
	
}
public class StackImplementationUsingArray {

	public static void main(String[] args) {
		
		StackArray stackArray=new StackArray(5);
		
		stackArray.push(11);
		stackArray.push(22);
		stackArray.push(33);
		stackArray.push(44);
		stackArray.push(55);
		stackArray.push(66);
		
		stackArray.stackPrint();
		
		stackArray.pop();
		stackArray.pop();
		
		stackArray.stackPrint();
		
		System.out.println(stackArray.peek());
		System.out.println(stackArray.isEmpty());
		System.out.println(stackArray.size());
		
		
	}

}
