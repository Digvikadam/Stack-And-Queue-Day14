package com.bridgelabz;

public class Operation {
	public StackAndQueue addElement() {
        StackAndQueue stackList =new StackAndQueue();
        stackList.push(70);
        stackList.push(30);
        stackList.push(56);

        stackList.display();
        return stackList;
    }

    public void peek(){
        StackAndQueue stackList =new StackAndQueue();
        stackList.push(70);
        stackList.push(30);
        stackList.push(56);
        stackList.peek();
    }

    public void pop(){
        System.out.println("Before Pop:");
        StackAndQueue stackList =addElement();
        stackList.pop();
        System.out.println("");
        System.out.println("After Pop:");
        stackList.display();
    }

    public void queueElement() {
        StackAndQueue stackList =new StackAndQueue();
        stackList.queue(56);
        stackList.queue(30);
        stackList.queue(70);
        stackList.display();
        System.out.println("");
        stackList.peek();
    }
}
