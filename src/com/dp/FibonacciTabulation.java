package com.dp;

public class FibonacciTabulation {
	
	
	int MAX = 1000;
	long lookup[] = new long[MAX+1];
	
	public static void main(String[] args) {
		
				
		FibonacciTabulation fM = new FibonacciTabulation();
		long startTime = System.currentTimeMillis();
		long val = fM.fib(fM.MAX);
		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.println("TimeTaken : " + timeTaken);
		System.out.println(val);
		
	}

	private long fib(int n) {
		lookup[0] = 0;
		lookup[1] = 1;
		for (int i = 2; i <= MAX; i++) {
			lookup[i] = lookup[i-1] + lookup[i-2];
		}
		return lookup[n];
	}

}
