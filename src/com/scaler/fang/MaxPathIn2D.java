package com.scaler.fang;

public class MaxPathIn2D {
	public static void main(String[] arhkjfs) {
		int[] A = {9, 10, 3, 5, 6, 8};
		System.out.println(search(A, 8));
	}
	
	public static int search(final int[] A, int B) {
		return findInd(A, B, 0, A.length-1);
    }
	
	public static int findInd(final int[] A, int B, int l, int h) {
		if(l>h) {
			return -1;
		}
		int m = (l+h)/2;
		if(B==A[m]) {
			return m;
		}
		if(B>A[m] && B<A[h]) {
			return findSorted(A, B, m+1, h);
		}else {
			return findInd(A, B, l, m-1);
		}
	}
	
	public static int findSorted(final int[] A, int B, int l, int h) {
		if(l>h) {
			return -1;
		}
		int m = (l+h)/2;
		if(B==A[m]) {
			return m;
		}
		if(B<A[m]) {
			return findInd(A, B, l, m-1);
		}else {
			return findInd(A, B, m+1, h);
		}
		
	}

}
