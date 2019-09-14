package com.example.datastructure.stack;

public class Starter {

	public static void main(String[] args) {

		StackUsingArray<String> stackUsingArray = new StackUsingArray<String>(String[].class,2);
		System.out.println(stackUsingArray.push("Naveen"));
		System.out.println(stackUsingArray.push("ddd"));
		System.out.println(stackUsingArray.push("ddff"));
		System.out.println(stackUsingArray.push("567"));
		System.out.println(stackUsingArray.pop());
		System.out.println(stackUsingArray.peek());

		System.out.println("\n--- Stack Using Linked List ---\n");

		StackUsingLinkedList<String> stack = new StackUsingLinkedList<String>("Hello");
		stack.push("Hey");
		stack.push("Igzo");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
