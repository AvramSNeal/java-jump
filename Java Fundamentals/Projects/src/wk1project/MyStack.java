package wk1project;

import java.util.Arrays;
import java.util.Stack;

/*
Using the Java language features learned so far, implement a Stack data structure for storing String objects, using an array.
A stack is a linear data structure which follows the LIFO (last-in first-out) principle.

What goes inside the stack first comes out last, or what goes in a stack last comes out first.

That means the objects can be inserted or removed only at one end of it also called as top.

Implement the Stack in a separate class called MyStack, and test the operations of the stack 
from the main method of a class called TestStack

Public methods that need to be exposed by the class:
	public void push(String data)
	- to put a new data element in the stack
	public String pop()
	- to get the top element of the stack
	public String peek()
	- to check the top most element of stack without removing it from stack

Hint: The class MyStack should have these private data members(below) to handle the implementation of the stack.
	- private int stackSize
	- private String[] stackData
	- private int topOfStack 
 */

public class MyStack {
	
	private String[] stackData;
	private int stackSize;
	private int topOfStack = -1;
	Stack <String> stack = new Stack <String>();//Create a new stack in Java

/*	//This is the simpler way to utilize push, pop, and peek.
	public void push(String data) {
		stack.push(data);
		System.out.println("PUSH: New data element " + data);
	}
	
	public String pop() {
		String x = (String) stack.pop();
		System.out.println("POP: Removed top data element " + x);
		return x;
	}
	
	public String peek() {
		String x = (String) stack.peek();
		System.out.println("PEEK: Top data element is ");
		return x;
	}
*/	
    MyStack(int stackSize){
        this.stackSize = stackSize;
        stackData = new String[this.stackSize];
        Arrays.fill(stackData, "-1");
    }
    
    public void push(String data){
        if((topOfStack + 1) < stackSize){
            topOfStack++;
            stackData[topOfStack] = data;
            System.out.println("PUSH: New data element " + data);
        }else{
            System.out.println("Stack is full");
        }
    }
    
    public String pop(){
        if(topOfStack >= 0){
        	
        	String pop = stackData[topOfStack];
            System.out.println("POP: Removed top data element " + stackData[topOfStack]);
            /*stackData[topOfStack] = "-1";
            return stackData[topOfStack--];*/
            stackData[topOfStack--] = null;
            return pop;
        }else{
            System.out.println("POP FAILED. Stack is empty");
            return "-1";
        }
    }
    
    public String peek() {
        if(topOfStack >= 0) {
        	System.out.println("PEEK: Top data element is " + stackData[topOfStack]);
        	return stackData[topOfStack];
        }else{
            System.out.println("PEEK FAILED. Stack is empty");
            return "-1";
        }
    	
    }
	
}



