package com.dp;

public class BinomialCoefficient {
	
	public static void main(String[] args) {
		int n=4,r=2;
		BinomialCoefficient bc = new BinomialCoefficient();
		int val = bc.getNumberOfCombinations(n,r);
		System.out.println(val);
	}

	private int getNumberOfCombinations(int n, int r) {
		int cr[][] = new int[n+1][r+1];
		
		for (int i=0; i<=n; i++) {
			for(int j=0;j<=r;j++) {
				if (i==0) {
					cr[i][j] = 1;
				} else if (j==0) {
					cr[i][j] = 1;
				} else if (i==j) {
					cr[i][j] = 1;
				} else {
					cr[i][j] = cr[i-1][j-1] + cr[i-1][j];
				}
			}
		}
		return cr[n][r];
	}

}
