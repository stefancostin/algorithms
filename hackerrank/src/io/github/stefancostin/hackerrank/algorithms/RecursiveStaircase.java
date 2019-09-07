package io.github.stefancostin.hackerrank.algorithms;

public class RecursiveStaircase {
	
	public static void main(String[] args) {
		int n = 100; // No. of steps
		int paths = countPaths(n); // No. of possible paths
		
		System.out.println("For " + n + " steps, there are " + paths + " possible paths for a child that takes 1, 2 or 3 steps at a time.");
	}
	
	public static int countPaths(int steps) {
		// BASE CASE: 
		// Only return 1 for a path that reaches the last step (steps == 0)
		if (steps < 0) {
			return 0;
		} else if (steps == 0) {
			return 1;
		}
		
		// Backtracking
		return countPaths(steps - 1) + countPaths(steps - 2) + countPaths(steps - 3);
	}
	
}
