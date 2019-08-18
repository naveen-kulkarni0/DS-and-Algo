package com.example.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = {7,2,2,1,6,9};	
		//int[] array = {9,8,7,6,5,4,3,2,1};

//The below way is a little optimized version of bubble sort as we don't have to iterate over the sorted 
//elements bubbled over to the right.
//Once the inner loop is completed the sorted elements would be bubbled over to the end,so we don't have to 
//compare it again for a new iteration of the outer loop.
		for(int i = array.length - 1; i>=0;i--) {

			for(int j=0; j<i;j++) {

				if(array[j]>array[ j + 1]) {
					//Swap the contents
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}

		}

		//Printing the contents
		for(int i =  0 ; i<array.length ; i++) {
			System.out.println(array[i]);
		}

	}

}
