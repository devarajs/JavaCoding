package com.sansahi.datastructures;


public class InsertSort {

	public static void sort(Comparable[] a) {
		
		
		for(int i=0; i < a.length; i++) {
			for (int j=i; j >0; j--) {
				if (less(a[j], a[j-1])) {
					exchange(a, j, j-1);
				}
				else break;
			}
		}
		
	}

	@SuppressWarnings("unchecked")
	private static boolean less(@SuppressWarnings("rawtypes") Comparable a, @SuppressWarnings("rawtypes") Comparable b) {
		return a.compareTo(b) < 0 ;
	}

	
	
	@SuppressWarnings("unused")
	private static void exchange(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] test = {"test", "bob", "geek"};
		Integer[] numtest ={ 3,6,4,8,7,2,9,1,0};
		InsertSort.sort(numtest);
		
		for (int i=0; i<numtest.length; i++) {
			
			System.out.println(numtest[i].toString());
			
		}
		
	}
}
