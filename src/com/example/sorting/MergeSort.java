package com.example.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] unsortedArray = {20,35,-15,7,55,1,-22};

		splittingPhase(unsortedArray,0,unsortedArray.length);

		//Printing the Array

		for (int i = 0; i < unsortedArray.length; i++) {
			System.out.println(unsortedArray[i]);
		}
	}

	public static void splittingPhase(int[] input,int start,int end) {
		System.out.println(start + " ----- > " + end);
		//Below is the breaking condition of the recursion, 
		if(end - start < 2){
			return;
		}
		System.out.println("Here");
		int mid = (end + start)/2;
		System.out.println(mid);
		//split the left side of the array
		splittingPhase(input, start, mid);
		System.out.println("Calling the Right splitting");
		//splitting the right side of array
		splittingPhase(input, mid, end);

		merge(input,start,mid,end);
	}


	public static void merge(int[] input,int start,int mid,int end) {
		System.out.println(start + " --> " + mid + " --->" + end + "||||||||||||||||||||||||||||||||||||||||");
		if(input[mid-1] < input[mid]) {
			return;
		}

		int[] temp = new int[end - start];
		int tempIndex=0;
		int i = start;
		int j = mid;
		
		System.out.println("Before copying " + i + j + tempIndex + "  " + temp.length);
		
		while(i < mid && j < end) {
			temp[tempIndex++] = input[i]<=input[j] ? input[i++]:input[j++];
		}

		System.out.println("Copying " + i + j + tempIndex);
		System.arraycopy(input, i, input, start + tempIndex, mid-i);
		System.arraycopy(temp, 0, input, start, tempIndex);


	}
}
