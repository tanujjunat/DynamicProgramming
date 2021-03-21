package com.dp;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		int L[] = {'a','b','c','d','e','f','g'};
		int M[] = {'a','b','x','d','f','g'};
		
		LongestCommonSubsequence lcp = new LongestCommonSubsequence();
		int val = lcp.getLongestCommonSubsequence(L,M);
		System.out.println(val);
	}

	private int getLongestCommonSubsequence(int[] array1, int[] array2) {
		int [] lc [] = new int[array1.length+1][array2.length+1];
		for (int i=0; i<=array1.length;i++) {
			for (int j=0; j<=array2.length; j++) 
				if (j == 0 || i == 0) {
					lc[i][j] = 0;
				} else if (array1[i-1] == array2[j-1]) {
					lc[i][j] = lc[i-1][j-1]+1;
				} else {
					lc[i][j] = Math.max(lc[i][j-1],lc[i-1][j]);
				}
		}
		return lc[array1.length][array2.length];
	}

}
