package io.github.stefancostin.udemy.algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
				lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 0; i <= lastUnsortedIndex; i++) {
				if (intArray[i] >= intArray[largest]) {
					largest = i;
				}
			}
			swap (intArray, largest, lastUnsortedIndex);
		}
		print(intArray);
	}
	
	public static void swap(int[] arr, int firstIndex, int secondIndex) {
		if (firstIndex == secondIndex) {
			return;
		}
		int temp = arr[firstIndex];
		arr[firstIndex] = arr[secondIndex];
		arr[secondIndex] = temp;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\n");
	}

}
