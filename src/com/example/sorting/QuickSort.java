package com.example.sorting;

public class QuickSort {

	/*
	 * Average time complexity of Quick Sort is O(nlogn), the worst case can go up to O(n^2)
	 * The main advantage of Quick Sort over Merge Sort is it operates on the same array so the
	 * space complexity is less.
	 * We assume a pivot element and start the mechanism, after the first iteration the pivot element
	 * would be in the correct position. We then recursive call the same method again passing only the
	 * left half of the array and assuming a new pivot.
	 * For simplicity we have assumed the first element of the array/sub array that would be passed as pivot.
	 */

	public static void main(String[] args) {
		int[] unsortedArray = {20,35,-15,7,55,1,-22};

		quickSort(unsortedArray, 0, 0, unsortedArray.length);

		//Print the Array Elements
		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.println(unsortedArray[i]);
		}
	}

	//	{20,35,-15,7,55,1,-22};
	//	public static void quickSort(int[] input,int start, int pivotPosition, int end) {
	//
	//		if(end - start < 2)
	//			return;
	//
	//
	//		int i = start;
	//		int j = end-1;
	//		int pivotElement = input[pivotPosition];
	//
	//
	//
	//
	//		boolean iterateJ =  true;
	//		boolean iterateI = true;
	//
	//		while(i < j) {
	//			if(iterateJ) {
	//				if(input[j] <= pivotElement) {
	//					input[i] = input[j];
	//					i++;
	//					iterateI = true;
	//					iterateJ = false;
	//				}
	//				else
	//				{
	//					j--;
	//					iterateJ=true;
	//					iterateI = false;
	//				}
	//
	//			}
	//			if(iterateI) {
	//
	//				if(input[i] >= pivotElement) {
	//					input[j]=input[i];
	//					j--;
	//					iterateI = false;
	//					iterateJ = true;
	//				}
	//				else {
	//					i++;
	//					iterateI=true;
	//					iterateJ=false;
	//				}
	//
	//			}
	//		}
	//
	//
	//		input[j]=pivotElement;
	//		quickSort(input, start, start, j);
	//		quickSort(input, j+1, j+1, end);
	//	}

	public static void quickSort(int[] inputArray, int start, int pivotPosition, int end) {

		if(end-start < 2)
			return;

		int i = start;
		int j = end;
		int pivotElement = inputArray[pivotPosition];

		while(i<j) {

			/*
			 *An Empty loop until we find the first element Jth element that will be less than Pivot
			  Or until we have reached the end of the array/sub-array
			This loop has to be executed until we find the first Jth element that is less than the pivot
			hence our condition in the loop is element at Jth position is greater than pivot, the moment
			element at Jth postition becomes less than pivot we would have found our first Jth element
			that is less than pivot and hence we would copy it to Ith position.
			The same goes with second loop for Ith elements, we wait until we find the first Ith element
			is more than the pivot hence our condition in the loop is I less than pivot, the moment 
			I is greater than pivot element the condition would fail and we come out of the loop.
			 */
			while(i<j && inputArray[--j] >= pivotElement);
			if(i<j)
				inputArray[i] = inputArray[j];

			//An Empty loop until we find the first Ith element that is more than the pivot
			//Or until we have reached the end of the array/sub Array
			while(i<j && inputArray[++i] <= pivotElement);
			if(i<j)
				inputArray[j]=inputArray[i];
		}
		inputArray[i] = pivotElement;
		quickSort(inputArray, start, start, i);
		quickSort(inputArray, i+1, i+1, end);
	}
}
