package com.sansahi.datastructures;

public class QuickUnion {


	private int[] objects;
	public QuickUnion(int N) {
		objects = new int[N];
		for (int i=0; i<N; i++) {
			
			objects[i] = i;
		}
	}
	
	private int root(int x) {
		while (x != objects[x]) x = objects[x];
		return x;
			
		}
	
	
	public boolean isConnected(int p, int q) {
		return root(p) == root(q);
	}
	public void Union(int p, int q) {
		int i = root(p);
		int j = root(q);
		objects[i] = j;
		}
			
			
	}


