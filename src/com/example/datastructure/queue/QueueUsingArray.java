package com.example.datastructure.queue;

import java.lang.reflect.Array;

public class QueueUsingArray<E> {
	private int first;
	private int last;
	private E[] queue;

	public QueueUsingArray(Class<E[]> clazz,int size){
		queue = clazz.cast(Array.newInstance(clazz.getComponentType(), size));
	}

	public void add(E element) {
		if(last == queue.length -1) {
			E[] newQueue = (E[]) Array.newInstance(queue.getClass().getComponentType(),queue.length*2);
			System.arraycopy(queue, 0, newQueue, 0, queue.length);
			queue = newQueue;
		}
		queue[last++] = element;
	}

	public E remove() {
		if(first < 0)
			return null;
		E removedElement = queue[first];
		queue[first++] = null;
		return removedElement;
	}

	public E peek() {
		if(first < 0)
			return null;
		return queue[first];
	}

	public void printQueue() {
		for (int i = 0; i < queue.length; i++) {
			if(null != queue[i])
			System.out.println(queue[i]);
		}
	}
}
