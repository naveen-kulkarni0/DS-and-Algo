package com.example.datastructure.stack;

import java.lang.reflect.Array;

public class StackUsingArray<E> {
	private E[] stackElements;
	private int top = -1;

	/*
	 * Creating a stack object with generic type, E would be replaced with the Class type when creating 
	 * a stack object. The Array.newInstance creates a new Array of the given class type and length.
	 * If the calzz is an array the component type returns the appropriate component type for creating an
	 * array else it returns null.
	 */
	public StackUsingArray(Class<E[]> clazz,int length) {
		stackElements = clazz.cast(Array.newInstance(clazz.getComponentType(), length));
	}

	public boolean push(E object) {
		if(top == stackElements.length -1) {
			E[] newStackElements = (E[]) stackElements.getClass().cast(Array.newInstance(stackElements.getClass().getComponentType(), 2*stackElements.length));
			System.arraycopy(stackElements, 0, newStackElements, 0,stackElements.length);
			stackElements = newStackElements;
		}
		stackElements[++top] = object;
		return true;
	}

	public E pop() {
		if(top < 0) {
			return null;
		}
		E obj = stackElements[top];
		stackElements[top--] = null;
		return obj;
	}

	public E peek() {
		if(top < 0) {
			return null;
		}	
		return stackElements[top];
	}
}
