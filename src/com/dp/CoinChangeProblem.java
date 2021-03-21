package com.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoinChangeProblem {
	
	public static void main(String[] args) {
		List<Long> c = Arrays.asList(1L,2L,3L);
		int n = 4;
		Map<String, Long> dp = new HashMap<>();
		Long st = getWays(n,c,dp);
		System.out.println(st);
	}

	private static Long getWays(int n, List<Long> c, Map<String, Long> dp) {
		
		if (dp.get(c.toString()+n) != null) {
			return dp.get(c.toString()+n);
		}
		Long ways = 0L;
		if (c.size() - 1 >= 0) {
			if (n == 0) {
				return 1L;
			}
			if (n < 0) {
				return 0L;
			}
			ways = getWays(n - c.get(c.size() -1).intValue(), c, dp) + getWays(n, c.subList(0, c.size() -1), dp);
			dp.put(c.toString()+n, ways);			
		}
		
		return ways;
	}
	
	
	
}
