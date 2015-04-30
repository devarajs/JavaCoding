package com.sansahi.datastructures;

public class QuickFind {
	private static String Connected = "Connected";
	private static String NotConnected = "NotConnected";

	private int[] objects;
	public QuickFind(int N) {
		objects = new int[N];
		for (int i=0; i<N; i++) {
			
			objects[i] = i;
		}
	}
	
	public boolean isConnected(int p, int q) {
		return objects[p] == objects[q];
	}
	public void Union(int p, int q) {
		int val1 = objects[p];
		int val2 = objects[q];
		for (int i=0; i < objects.length; i++) {
			if(objects[i] == val1) objects[i] = val2;
		}
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickFind qf = new QuickFind(6);
		qf.Union(2,5);
		qf.Union(1,3);
		qf.Union(3,5);
		String status;
		if (qf.isConnected(1,5)) {
			status = Connected;
		} else {
			status = NotConnected;
		}
		System.out.println("Is 1 conncted to 5 "+ status);
		
	}

}
