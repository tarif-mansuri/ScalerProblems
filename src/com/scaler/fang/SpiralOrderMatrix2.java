package com.scaler.fang;

public class SpiralOrderMatrix2 {
	public static void main(String[] args) {
		//System.out.println(generateMatrix(4));
		int n=3;
		int[][] res = generateMatrix(n);
		
		for(int i=0 ;i<n; i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res[i][j]+",  ");
			}
			System.out.println();
		}
	}

	public static int[][] generateMatrix(int A) {
		int[][] M = new int[A][A];
		int count = 1;
		int i = 0;
		int j = 0;
		int unit = 0;
		while(unit<A/2) {
			for(;j<A-unit-1; j++) {
				M[i][j] = count++;
			}
			for(;i<A-unit-1; i++) {
				M[i][j] = count++;
			}
			for(; j>unit; j--) {
				M[i][j] = count++;
			}
			for(;i>unit; i--) {
				M[i][j] = count++;
			}
			unit++;
			i=i+1;
			j=j+1;
		}
		if(A%2!=0) {
			M[A/2][A/2] = count;
		}
		return M;
    }
}
