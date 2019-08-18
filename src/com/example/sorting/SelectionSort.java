package com.example.sorting;

public class SelectionSort {
	
	/*
	 * In selection sort we take the largest element in the array in every iteration and exchange it 
	 * with the last element of the unsorted part of the array. Initially the entire array would be unsorted
	 * but as we proceed with the alog we start sorting from the right side(extreme end).
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArray = {9,8,7,6,5,4,3,2,1,-11,-11,-2};
		
		for(int i =unsortedArray.length-1;i>0;i--) {
			int indexOfLargest = 0;
			int largest = unsortedArray[0];

			for(int j = 1; j <= i; j++) {
				
				//Find the index of largest element and exchange it with the last element of the unsorted partition.
				if(largest<unsortedArray[j]) {
					largest = unsortedArray[j];
					indexOfLargest = j;
				}
			}
			int temp = unsortedArray[indexOfLargest];
			unsortedArray[indexOfLargest] = unsortedArray[i];
			unsortedArray[i] = temp;
		}
		
		
		//Print the elements of the Array
		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.println(unsortedArray[i]);
		}

	}

}
