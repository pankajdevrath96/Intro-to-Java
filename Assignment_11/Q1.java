package Assignment_11;

import java.util.Scanner;

class myStack{
	int[] arr;
	int lastIndex,n;
	public myStack()
	{
		System.out.println("Enter the basic size of your stack: ");
		Scanner sc= new Scanner(System.in);
		 n=sc.nextInt();
		arr=new int[n];
		
	}
	public void push(int x)
	{
		if(n==lastIndex)
			reConstruct();
		arr[lastIndex++]=x;
		
	}
	public void reConstruct()
	{
		n=n+n/2;
		int temp[]=arr;
		arr=new int[n];
		for(int i=0;i<temp.length;i++)
			arr[i] = temp[i];
	}
	public void pop()
	{
		if(lastIndex!=0)
			lastIndex--;
		else
			System.out.println("Stack is Empty.");
	}
	public int top()
	{
			return arr[lastIndex-1];
			
	}
	public boolean isEmpty() {
		
		return (lastIndex==0);
	}
	
	public int getSize() {
		
		return lastIndex;
	}
	
	public  int getCapacity() {
		
		return n;
	}
	
}


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStack obj=new myStack(); 
		System.out.println("how many number of elements you want to pass in stack: ");
		Scanner sc= new Scanner(System.in);
		 int m=sc.nextInt();
		 System.out.println("Enter the elements you want to push in stack: "); 
		for(int i = 0; i <m; i++) 
			obj.push(sc.nextInt());
			
		System.out.println("Number of elements in the stack : " + obj.getSize()+"   Capacity of the stack : " + obj.getCapacity()+"\n"+(obj.isEmpty()?"Stack is Empty.":"Stack is not Empty."));
		
		
		for(int i = 0; i <m; i++) 
			{
			System.out.println("Top element : " + obj.top());
			obj.pop();
			}
			
		System.out.println("Number of elements in the stack : " + obj.getSize()+"   Capacity of the stack : " + obj.getCapacity()+"\n"+(obj.isEmpty()?"Stack is Empty.":"Stack is not Empty."));
		
		


	}	
	
}


