package io.github.stefancostin.udemy.algorithms;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
                firstUnsortedIndex++) {
            
            int newElement = intArray[firstUnsortedIndex];
            
            // Use iterator to assign values after inner loop
            int i;
            
            // Swap array elements
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            
            intArray[i] = newElement;
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
