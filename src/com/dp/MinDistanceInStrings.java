package com.dp;

public class MinDistanceInStrings {
	
	
	public static void main(String[] args) {
		MinDistanceInStrings minDistanceInStrings = new MinDistanceInStrings();
		String first = "hello";
		String second = "hllo";
		minDistanceInStrings.getMinimumDistanceInStrings(first, second);
		
	}

	private void getMinimumDistanceInStrings(String first, String second) {
		char [] firstCharArray = first.toCharArray();
		char [] secondCharArray = second.toCharArray();
		
		int lookupTable [][] = new int[first.length()+1][second.length()+1];
		for (int i=0; i<=first.length(); i++) {
			for (int j=0; j<=second.length(); j++) {
				if (i == 0) {
					lookupTable[i][j] = j;
				} else if (j == 0) {
					lookupTable[i][j] = i;
				} else if (firstCharArray[i-1] == secondCharArray[j-1]) {
					lookupTable[i][j] = lookupTable[i-1][j-1];
				} else {
					lookupTable[i][j] = 1+ min(lookupTable[i][j-1], lookupTable[i-1][j], lookupTable[i-1][j-1]);
				}
			}
		}
		System.out.println(lookupTable[first.length()][second.length()]);
	}

	private int min(int i, int j, int k) {
		
		return Math.min(Math.min(i, j), k);
	}
}
