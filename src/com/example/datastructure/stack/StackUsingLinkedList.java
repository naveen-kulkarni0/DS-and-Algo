package com.example.datastructure.stack;

public class StackUsingLinkedList<E> {

	private class Node<E>{
		E data;
		Node<E> next;

		public Node(E data) {
			this.data = data;
		}
	}

	private Node<E> top;

	public StackUsingLinkedList(E data) {
		top = new Node<E>(data);
	}

	public void push(E data) {
		Node<E> nextElement = new Node<E>(data);
		nextElement.next = top;
		top = nextElement;
	}

	public E pop() {
		if(null==top)
			return null;
		Node<E> removedNode = top;
		top = removedNode.next;
		return removedNode.data;
	}

	public E peek() {
		if(null == top)
			return null;
		return top.data;	
	}
}
