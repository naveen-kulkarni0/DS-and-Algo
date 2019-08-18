package com.example.arrays;

//Add the adjacent elements of an array if they are equal with a time complexity of O(n)
public class AdditionOfAdjacentElements {

	public static void main(String[] args) {
		int[] input = {1,1,2,4,8};
		int [] result = new int[input.length];
		int resultArrayIndex = 0;

		result[resultArrayIndex] = input[resultArrayIndex];

		for(int i = 1; i < input.length ; i++) {

			if(input[i] == input[i - 1] || input[i] == result[resultArrayIndex]) {
				result[resultArrayIndex] += input[i];
			}
			else {
				resultArrayIndex++;
				result[resultArrayIndex] = input[i];
			}

		}


		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
