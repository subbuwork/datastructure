package com.java.ds;

public class Stack {

	private Integer maxSize;
	private Long[] stackArray;
	private Integer top;
	
	public Stack(Integer size){
		this.maxSize = size;
		stackArray = new Long[maxSize];
		this.top = -1;
	}
	
	public void push(Object val){
		stackArray[++top] = new Long(val.toString());
	}
	public Long pop(){
		return new Long(stackArray[top--]);
	}
	

	public Long peek(){
		return stackArray[top];
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	public boolean isFull(){
		return (top == maxSize -1);
	}
	
	
	public static void main(String[] args) {
     Stack stack = new Stack(5);
     stack.push(new Long(1));
     stack.push(new Long(2));
     stack.push(new Long(3));
     stack.push(new Long(4));
	 stack.push(new Long(50));
	 System.out.println("Is statck full:::"+stack.isFull());
	 System.out.println("Peek value::"+stack.peek());
	 while(!stack.isEmpty()){
		 System.out.println("Value::"+stack.pop());
	 }
	 
	}

}
