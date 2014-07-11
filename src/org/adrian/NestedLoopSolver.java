package org.adrian;

public class NestedLoopSolver implements Solver {

	public long solve(final int k, int[][] stars) {

		final int n = stars.length;
		final int k1 = (int) Math.pow(k, 2);
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (dist(stars[i], stars[j]) < k1) {
					count++;
				}
			}
		}

		return count;
	}

	private double dist(int[] star1, int[] star2) {
		int x = star1[0] - star2[0];
		int y = star1[1] - star2[1];
		int z = star1[2] - star2[2];
		
		return Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
	}

}
