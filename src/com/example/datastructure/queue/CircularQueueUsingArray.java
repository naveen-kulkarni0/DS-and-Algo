package com.example.datastructure.queue;

import java.lang.reflect.Array;

public class CircularQueueUsingArray<E> {
	private int first;
	private int last;
	private E[] queue;

	public CircularQueueUsingArray(Class<E[]> clazz,int size){
		queue = clazz.cast(Array.newInstance(clazz.getComponentType(), size));
	}

	public void add(E element) {
		if(size() == queue.length - 1) {
			System.out.println("Resized the array");
			int arrElements = size();
			E[] newQueue = (E[]) Array.newInstance(queue.getClass().getComponentType(),queue.length*2);
			System.arraycopy(queue, first, newQueue, 0, queue.length - first);
			System.arraycopy(queue, 0, newQueue, queue.length - first, last);
			queue = newQueue;
		}
		queue[last] = element;

		//Circling the last back to the beginning of array.
		if(last < queue.length - 1){
			last ++;
		}
		else {
			last = 0;
		}
	}

	public E remove() {
		if(size() == queue.length )
			return null;
		E removedElement = queue[first];
		queue[first] = null;
		if(first < queue.length - 1) {
			first ++;
		}
		else {
			first = 0;
		}
		return removedElement;
	}

	public int size() {
		if(first <= last) {
			return last - first;
		}
		else {
			return last - first + queue.length;
		}
	}

	public E peek() {
		if(first < 0)
			return null;
		return queue[first];
	}

	public void printQueue() {
		if(first <= last) {
			for (int i = 0; i < queue.length; i++) {
				if(null != queue[i])
					System.out.println(queue[i]);
			}
		}
		else {
			for(int i = first ; i < queue.length ; i++) {
				if(null!=queue[i])
					System.out.println(queue[i]);
			}
			for(int i = 0; i < first; i++) {
				if(null!=queue[i])
					System.out.println(queue[i]);
			}
		}
	}
}
