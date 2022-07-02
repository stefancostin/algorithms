package io.github.stefancostin.udemy.algorithms;

import java.util.Arrays;

//Memory Complexity: In-Place Algorithm
//Time Complexity: O(n^2) Quadratic
public class InsertionSort {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

			int newElement = intArray[firstUnsortedIndex];

			// Use iterator to assign values after inner loop
			int i;

			// Swap array elements
			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}

			intArray[i] = newElement;
		}

		System.out.println(Arrays.toString(intArray));
	}
	
}
