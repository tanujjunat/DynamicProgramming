package com.dp;

public class SherlockAndCost {
	
	public static void main(String[] args) {
		int [] B = {2,1,2,5};
		int cost = cost(B);
		System.out.println(cost);
	}

	private static int cost(int[] B) {
		int maxDiff1 = 0;
		int maxDiff2 = 0;
		int lowHighDiff = 0;
		int highLowDiff = 0;
		int highHighDiff = 0;
		int lowLowDiff = 0;
		
		for (int i = 1; i < B.length; i++) {
			lowHighDiff = Math.abs(max(B[i]) - min(B[i-1]));
			highLowDiff = Math.abs(min(B[i]) - max(B[i-1]));
			highHighDiff = Math.abs(max(B[i]) - max(B[i-1]));
			//lowLowDiff = Math.abs(min(B[i]) - min(B[i-1]));
			//maxDiff1 = maxDiff1 + Math.max(lowHighDiff, highHighDiff);
			//maxDiff2 = maxDiff2 + highLowDiff;
			
			maxDiff1 = Math.max(maxDiff1, maxDiff2+highLowDiff);
			maxDiff2 = Math.max(maxDiff2+highHighDiff, maxDiff1+lowHighDiff);
					
					//low = low_next
					//hi = hi_next
			
		}
		
		return Math.max(maxDiff1, maxDiff2);
	}

	private static int min(int i) {
		return 1;
	}

	private static int max(int i) {
		return i;
	}

}
