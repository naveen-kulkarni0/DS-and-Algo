package com.example.datastructure.queue;

public class Starter {

	public static void main(String[] args) {
//		QueueUsingArray<String> queue = new QueueUsingArray<String>(String[].class, 1);
		
		CircularQueueUsingArray<String> cQueue = new CircularQueueUsingArray<String>(String[].class, 4);
		
		cQueue.add("Hello");
		cQueue.add("Hey");
		cQueue.remove();
		cQueue.add("Seriously");
		cQueue.remove();
		cQueue.add("Majikayo");
		cQueue.remove();
		cQueue.add("Mugiwara");
		
		cQueue.add("Blah");
		cQueue.remove();
		
		cQueue.add("Balu");
		cQueue.remove();
		
		cQueue.add("Laboon");
		cQueue.remove();
		
		cQueue.add("Franky");
		cQueue.remove();
		
		cQueue.add("WOW");
		cQueue.add("SWITCH");
		cQueue.add("Majikayo");
		cQueue.add("AMS");
		
		cQueue.printQueue();
	}

}
