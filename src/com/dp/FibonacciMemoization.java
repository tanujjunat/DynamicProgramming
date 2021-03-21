package com.dp;

public class FibonacciMemoization {
	
	
	int MAX = 1000;
	long lookup[] = new long[MAX+1];
	int i;
	
	public static void main(String[] args) {
		
				
		FibonacciMemoization fM = new FibonacciMemoization();
		
		long startTime = System.currentTimeMillis();
		fM.initialize();
		long val = fM.fib(fM.MAX);
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.println("TimeTaken : " + timeTaken);
		System.out.println(val);
		
	}

	private long fib(int i) {
			if (lookup[i] == -1) {
				if (i <= 1) {
					lookup[i] = i;
				} else {
					lookup[i] = fib(i-1) + fib(i-2);
				}
				
			}
		return lookup[i];
	}

	private void initialize() {
		for (i = 0; i <= MAX; i++) {
			lookup[i] = -1;
		}
	}

}
