package com.bridgelabz;

public class Operation {
	   public Stack addElement() {
	        Stack stackList =new Stack();
	        stackList.push(70);
	        stackList.push(30);
	        stackList.push(56);

	        stackList.display();
	        return stackList;
	    }

	    public void peek(){
	        Stack stackList =new Stack();
	        stackList.push(70);
	        stackList.push(30);
	        stackList.push(56);
	        stackList.peek();
	    }

	    public void pop(){
	        System.out.println("Before Pop:");
	        Stack stackList =addElement();
	        stackList.pop();
	        System.out.println("");
	        System.out.println("After Pop:");
	        stackList.display();
	    }
}
