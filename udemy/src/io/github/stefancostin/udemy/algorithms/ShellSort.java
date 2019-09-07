package io.github.stefancostin.udemy.algorithms;

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
		
		print(intArray);
		
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.print("\n");
	}

}
