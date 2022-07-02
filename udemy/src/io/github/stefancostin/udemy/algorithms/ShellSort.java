package io.github.stefancostin.udemy.algorithms;

import java.util.Arrays;

//Memory Complexity: In-Place Algorithm
//Time Complexity: O(n^2) Quadratic (could perform better than that)
public class ShellSort {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < intArray.length; i++) {
				int newElement = intArray[i];

				int j = i;

				while (j >= gap && intArray[j - gap] > newElement) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}

				intArray[j] = newElement;
			}
		}

		System.out.println(Arrays.toString(intArray));
	}

}
