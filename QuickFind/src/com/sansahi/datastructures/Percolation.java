package com.sansahi.datastructures;
import edu.princeton.cs.algs4.*;

public class Percolation {
	
	private int gridSize = 20;
	private int[][] grid;
	WeightedQuickUnionUF qf;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Percolation(int N)  {
		if (N <= 0) throw new java.lang.IllegalArgumentException();
		
		gridSize = N;
		grid = new int[gridSize][gridSize];
		//Block all sites in the grid
		for (int i=0; i < gridSize; i++) {
			for (int j=0; i < gridSize; j++ ) {
				grid[i][j] = 0;
				
			}
		}
	}             // create N-by-N grid, with all sites blocked
	public void open(int i, int j)    {
		if ((i < 1 ) || (j > gridSize)) {
			throw new java.lang.IndexOutOfBoundsException();
		}
	}      // open site (row i, column j) if it is not open already
	public boolean isOpen(int i, int j)  { 
		if ((i < 1 ) || (j > gridSize)) {
			throw new java.lang.IndexOutOfBoundsException();
		}
		return false;
	}   // is site (row i, column j) open?
	public boolean isFull(int i, int j)  {
		if ((i < 1 ) || (j > gridSize)) {
			throw new java.lang.IndexOutOfBoundsException();
		}
		return false;
	}   // is site (row i, column j) full?
	public boolean percolates()    {
		
		return false;}         // does the system percolate?


		

}
