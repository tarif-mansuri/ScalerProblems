package com.scaler.fang;

public class MinimumAppendPalindrom {
	public int solve(String A) {
        int count = 0;
        while(!isPalindrome(A, count, A.length()-1)){
            count++;
        }
        return count;
    }

    public boolean isPalindrome(String S, int s, int e){
        while(s<e){
            if(S.charAt(s)!=S.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

}
