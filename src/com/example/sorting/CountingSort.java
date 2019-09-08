package com.example.sorting;

public class CountingSort {

	public static void main(String[] args) {

		int[] inputArray = {2,3,4,2,5,7,7,10,9,8};

		int[] countingArray = new int[inputArray.length];

		countingSort(inputArray,countingArray);

		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}

	public static void countingSort(int[] inputArray, int[] countingArray) {

		//Counting logic for checking the number of occurrences of each element
		for (int i = 0; i < inputArray.length; i++) {
			countingArray[inputArray[i]-1]++;
		}

		int inputArrayIndex = 0;
		// Restructuring the original array based on the counting array.
		for (int i = 0; i < countingArray.length; i++) {
			//Wait until we find the first element of the counting array.
			while(countingArray[i]<1) {i++;}
			while((countingArray[i])-->0) {
				inputArray[inputArrayIndex++]=i+1;
			}
		}
	}

}
