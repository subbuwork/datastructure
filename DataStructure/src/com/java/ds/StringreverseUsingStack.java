package com.java.ds;

public class StringreverseUsingStack {
      private String input;
      private String output;
      
      public StringreverseUsingStack(String in){
    	  input = in;
      }
      
      public String revString(){
    	  Integer len = input.length();
    	  Stack stack = new Stack(len);
    	  for(int i =0; i<input.length();i++){
    		  char ch = input.charAt(i);
    		  stack.push(ch);
    	  }
    	  output = "";
    	  while(!stack.isEmpty()){
    		 char ch = stack.pop(); 
    		 output = output+ch;
    	  }
    	  return output;
      }
      
      
	public static void main(String[] args) {
		String input = "Java Source and Support";
		String output;
		StringreverseUsingStack theReverser = 
		      new StringreverseUsingStack(input);
		output = theReverser.revString();
		System.out.println("Reversed: " + output);
		
	}
	
	class Stack {
		private int maxSize;
		private char[] stackArray;
		private int top;
		public Stack(int max) {
			maxSize = max;
			stackArray = new char[maxSize];
			top = -1;
		}
		public void push(char j) {
			stackArray[++top] = j;
		}
		public char pop() {
			return stackArray[top--];
		}
		public char peek() {
			return stackArray[top];
		}
		public boolean isEmpty() {
			return (top == -1);
		}
	}

}
