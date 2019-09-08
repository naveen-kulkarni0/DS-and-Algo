package com.example.sorting;

public class InsertionSortRecursiveCall {

	public static void main(String[] args) {

		int[] unsortedArray = {1,0,22,-690,99,200,-690};
		sort(unsortedArray, 1);

		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.println(unsortedArray[i]);
		}
	}

	public static void sort(int[] input,int indexOfElementToBeInserted) {
		if(indexOfElementToBeInserted==input.length)
			return;
		int elementToBeInserted = input[indexOfElementToBeInserted];

		for (int i = 0; i < indexOfElementToBeInserted; i++) {
			if(input[i]>elementToBeInserted) {
				//Make Space for the entry
				int j = indexOfElementToBeInserted;
				//Start sliding the array
				while(j > i) 
					input[j] = input[--j];
				input[i] = elementToBeInserted;
				break;
			}
		}




		sort(input,++indexOfElementToBeInserted);
	}
}
