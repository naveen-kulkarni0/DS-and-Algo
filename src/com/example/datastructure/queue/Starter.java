package com.example.datastructure.queue;

public class Starter {

	public static void main(String[] args) {
		QueueUsingArray<String> queue = new QueueUsingArray<String>(String[].class, 1);
		queue.add("Naveen");
		queue.add("Shiv");
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}

}
