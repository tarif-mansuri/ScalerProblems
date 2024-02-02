package com.scaler.fang;

public class ASKWaterFlow {
	public static void main(String[] arhkjfs) {
		int[][] A = {
//		        {1, 2, 2, 3, 5},
//		        {3, 2, 3, 4, 4},
//		        {2, 4, 5, 3, 1},
//		        {6, 7, 1, 4, 5},
//		        {5, 1, 1, 2, 4}
				{2,3,6,7},
				{2,3,4,5} //for this, my answer is 8 but in gfg its 3, ask how ?? question itself is not clear for this problem
		};
		System.out.println(solve(A));
	}
	
	public static int solve(int[][] A) {
		int count = 0;
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				if(canFlowBlue(A, i, j) && canFlowRed(A, i, j)) {
					count++;
				}
			}
		}
		return count;
    }
	
	public static boolean canFlowRed(int[][] A, int i, int j) {
		if(i==A.length-1 || j==A[i].length-1) {
			return true;
		}
		
		boolean rightPathExists = canFlowBlue(A, i, j+1);
		boolean downPathExists = canFlowBlue(A, i+1, j);
		if((A[i][j] >= A[i+1][j] && downPathExists) || (A[i][j] >= A[i][j+1] && rightPathExists)) {
			return true;
		}else {
			return false;
		}
	}
    
	public static boolean canFlowBlue(int[][] A, int i, int j) {
		if(i==0 || j==0) {
			return true;
		}
		
		boolean leftPathExists = canFlowBlue(A, i, j-1);
		boolean upPathExists = canFlowBlue(A, i-1, j);
		if((A[i][j] >= A[i-1][j] && upPathExists) || (A[i][j] >= A[i][j-1] && leftPathExists)) {
			return true;
		}else {
			return false;
		}
	}

}
