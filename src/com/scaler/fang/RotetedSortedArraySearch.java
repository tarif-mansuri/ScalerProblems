package com.scaler.fang;

public class RotetedSortedArraySearch {
	public static void main(String[] arhkjfs) {
		int[] A = {8,10,11,1,2,3,4,5,6};
		System.out.println(search(A,7));
	}
	
	public static int search(final int[] A, int key) {
		
        return searchBin(A, key, 0, A.length-1);
    }

	private static int searchBin(int[] arr, int key, int l, int h) {
		if(l>h) {
			return -1;
		}
		int m = (l+h)/2;
		if(arr[m] == key) {
			return m;
		}
		else if(arr[l] <= arr[m]) {
			if(key >= arr[l] && key < arr[m]) {
				return searchBin(arr, key, l, m-1);
			}else {
				return searchBin(arr, key, m+1, h);
			}
		}else {
			if(key > arr[m] && key <= arr[h]) {
				return searchBin(arr, key, m+1, h);
			}else {
				return searchBin(arr, key, l, m-1);
			}
		}
	}

}
