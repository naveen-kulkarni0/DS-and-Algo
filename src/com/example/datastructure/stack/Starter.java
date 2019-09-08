package com.example.datastructure.stack;

public class Starter {

	public static void main(String[] args) {
		StackUsingArray<String> stack = new StackUsingArray<String>(String[].class,2);
		System.out.println(stack.push("Naveen"));
		System.out.println(stack.push("ddd"));
		System.out.println(stack.push("ddff"));
		System.out.println(stack.push("567"));
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
