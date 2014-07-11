package org.adrian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StarSimTest {
	
	Solver solver = new NestedLoopSolver();

	@Test
	public void onePairWithinK(){
		
		int k = 2; //4
		int[][] stars = new int[2][1];
		stars[0] = star(1,1,1); //3
		stars[1] = star(1,1,2); //6
		
		long output = solver.solve(k,stars);
		
		assertEquals(1, output);
		
	}
	
	@Test
	public void noPairWithinKWithNeg(){
		
		int k = 2; 
		int[][] stars = new int[2][1];
		stars[0] = star(1,1,1); 
		stars[1] = star(-1,-1,-2); 
		
		long output = solver.solve(k,stars);
		
		assertEquals(0, output);
		
	}
		
	
	@Test
	public void noPairWithinK(){
		
		int k = 1;  //4
		int[][] stars = new int[2][1];
		stars[0] = star(2,2,2); //12
		stars[1] = star(2,2,4); //24
		
		long output = solver.solve(k,stars);
		
		assertEquals(0, output);
		
	}
	
	
	@Test
	public void twoPairWithinK(){
		
		int k = 2; //4
		int[][] stars = new int[3][1];
		stars[0] = star(1,1,1); //3
		stars[1] = star(1,1,2); //6
		stars[2] = star(1,0,0); //1
		
		long output = solver.solve(k,stars);
		
		assertEquals(2, output);
		
	}

	@Test 
	public void finalTest(){
		
		int k = 2; //4
		int[][] stars = new int[7][1];
		stars[0] = star(0,0,0); 
		stars[1] = star(1,0,0); 
		stars[2] = star(1,2,0); 
		stars[3] = star(1,2,3); 
		stars[4] = star(1000,1000,1000); 
		stars[5] = star(1001,1001,1000); 
		stars[6] = star(1001,999,1001); 
		
		long output = solver.solve(k,stars);
		
		assertEquals(3, output);
	}
	
	@Test 
	public void finalTest2(){
		
		int k = 3; //4
		int[][] stars = new int[7][1];
		stars[0] = star(0,0,0); 
		stars[1] = star(1,0,0); 
		stars[2] = star(1,2,0); 
		stars[3] = star(1,2,3); 
		stars[4] = star(-1000,1000,-1000); 
		stars[5] = star(-1001,1001,-1000); 
		stars[6] = star(-1001,999,-1001); 
		
		long output = solver.solve(k,stars);
		
		assertEquals(6, output);
	}
	
	@Test 
	public void finalTest3(){
		
		int k = 4; //4
		int[][] stars = new int[7][1];
		stars[0] = star(0,0,0); 
		stars[1] = star(1,0,0); 
		stars[2] = star(1,2,0); 
		stars[3] = star(1,2,3); 
		stars[4] = star(1000,-1000,1000); 
		stars[5] = star(1001,-1001,1000); 
		stars[6] = star(1001,-999,1001); 
		
		long output = solver.solve(k,stars);
		
		assertEquals(9, output);
	}
	
	@Test 
	public void foo(){
		
		int k = 4; //4
		int[][] stars = new int[7][1];
		stars[0] = star(0,0,0); 
		stars[1] = star(1,0,0); 
		stars[2] = star(1,2,0); 
		stars[3] = star(1,2,3); 
		stars[4] = star(1000,-1000,1000); 
		stars[5] = star(1001,-1001,1000); 
		stars[6] = star(1001,-999,1001); 
		
		long output = solver.solve(k,stars);
	
		assertEquals(9, output);
		
	}

	
	private int[] star(int x, int y, int z) {
		int[] star = {x,y,z};
		return star;
	}
	
	

	
	
}
