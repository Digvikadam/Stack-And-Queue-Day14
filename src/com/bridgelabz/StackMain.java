package com.bridgelabz;

import java.util.Scanner;

public class StackMain {
	public static void main(String[] args) {
        System.out.println("Welcome to the stack program");
        Operation operation = new Operation();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press '1' to add element at the start \n" + "Enter 2 to show the peek element");
            switch (scanner.nextInt()) {
                case 1:
                    operation.addElement();
                    break;
                case 2:
                    operation.peek();
                    break;
                case 3:
                    operation.pop();
                    break;
            }
            scanner.close();
        }
}
