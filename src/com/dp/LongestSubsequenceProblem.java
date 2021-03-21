package com.dp;

public class LongestSubsequenceProblem {	

	public static void main(String[] args) {
		int [] arr = {10,50,2,7,9,60};
		LongestSubsequenceProblem lsp = new LongestSubsequenceProblem();
		int val = lsp.findLongestSubsequence(arr);
		System.out.println(val);
	}

	private int findLongestSubsequence(int []arr) {
				
		int LSCount[] = new int[arr.length];
		
		initialize(arr, LSCount);
		
		for (int i = 1; i<arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && LSCount[i] < LSCount[j] + 1) {
					LSCount[i] = LSCount[j] + 1;
				}
			}
		}
		int longestCount = LSCount[0];
		for (int i = 0; i<arr.length-1 ; i++) {
			if (longestCount < LSCount[i+1]) {
				longestCount = LSCount[i+1];
			}
		}
		return longestCount;
	}

	private void initialize(int[] arr, int[] LSCount) {
		for (int i = 0; i <arr.length; i++) {
			LSCount[i] = 1;
		}
	}
}
