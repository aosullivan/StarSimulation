package org.adrian;

import java.util.stream.Stream;


public class LambaSolver implements Solver {

	public long solve(final int k, int[][] stars) {

		final int k1 = (int) Math.pow(k, 2);
		
		return Stream.of(stars)
				.flatMapToDouble(star1 -> Stream.of(stars).mapToDouble(star2 -> dist(star1,star2))) 	 
				.filter(dist -> dist > 0)  
				.filter(dist -> dist < k1)
				.count()/2; 					//because of double counting		
		
	}

	private double dist(int[] star1, int[] star2) {
		int x = star1[0] - star2[0];
		int y = star1[1] - star2[1];
		int z = star1[2] - star2[2];
		
		return Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
	}

}
