package com.dp;

public class KnapsackProblem {

	public static void main(String[] args) {
		int weightArray [] = {10,20,30}; 
		int maxWeight = 50;
		int valuesArray [] = {60,100,120};
		KnapsackProblem kp = new KnapsackProblem();
		kp.getMaximumValue(maxWeight, weightArray, valuesArray);

	}

	private void getMaximumValue(int maxWeight, int[] weightArray, int[] valuesArray) {
		int [][]MaxValue = new int[valuesArray.length+1][maxWeight+1];
		int i,j=0;
		for (i=0; i<=valuesArray.length;i++) {
			for (j=0; j<=maxWeight;j++) {
				if (i == 0 || j == 0) {					
					MaxValue[i][j] = 0;
				} else if (weightArray[i-1] <= j) {
					MaxValue[i][j] = Math.max(MaxValue[i-1][j], valuesArray[i-1]+MaxValue[i-1][j-weightArray[i-1]]);
				} else {
					MaxValue[i][j] = MaxValue[i-1][j];
				}
			}
		}
		System.out.println(MaxValue[valuesArray.length][maxWeight]);
	}

}
