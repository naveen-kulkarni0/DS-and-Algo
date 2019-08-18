package com.example.sorting;

public class InsertionSort {

	/*
	 * Insertion sort starts sorting  the array from left to right, i takes the first element of
	 * the unsorted array and compares with sorted partition of the array. It then compares the 
	 * element with the sorted partition of the array and places accordingly.
	 * The time complexity is )(n^2), however it is a stable algorithm
	 */

	public static void main(String[] args) {

		//		int[] unsortedArray = {20,35,-15,7,55,1,-22};
		int[] unsortedArray = {-51,1100,100,-1,-2,1};

		for(int unsortedIndex=1;unsortedIndex<unsortedArray.length;unsortedIndex++) {
			int firstUnsortedElementOfTheArray = unsortedArray[unsortedIndex];
			int indexToBeSaved = unsortedIndex;

			for(int sortedIndex=unsortedIndex-1;sortedIndex>=0;sortedIndex--) {
				System.out.println("Inner loop : " + sortedIndex + " -- " + unsortedIndex);
				if(firstUnsortedElementOfTheArray < unsortedArray[sortedIndex]) {
					unsortedArray[sortedIndex + 1] = unsortedArray[sortedIndex];
					indexToBeSaved = sortedIndex;
				}

				//Where firstUnsortedElementOfTheArray is more than Nth element then it would also be more than N-1th element
				//So there is no need to check for the other elements since all the elements till N would already be sorted.
				//One challenge with insertion sort is when the number of elements are more and say we have already sorted more
				//than half of the array and the next unsorted element is the smallest in the list we will have to slide all
				//the sorted elements of the list by 1.
				else {
					break;
				}
			}

			unsortedArray[indexToBeSaved] = firstUnsortedElementOfTheArray;
		}

		//Printing the array
		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.println(unsortedArray[i]);
		}
	}
}
