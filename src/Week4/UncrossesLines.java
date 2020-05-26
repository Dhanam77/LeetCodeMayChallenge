package Week4;

/*
 We write the integers of A and B (in the order they are given) on two separate horizontal lines.

Now, we may draw connecting lines: a straight line connecting two numbers A[i] and B[j] such that:

A[i] == B[j];
The line we draw does not intersect any other connecting (non-horizontal) line.

 */
public int maxUncrossedLines(int[] A, int[] B) {
    int[][] dp = new int[A.length][B.length];
    for(int i = 0; i < A.length; i++){
        for(int j = 0; j < B.length; j++){
            dp[i][j] = -1;
        }
    }
    
    return lcs(A, B, 0, 0, dp);
}


int lcs(int[] A, int[] B, int i, int j, int[][] dp){
    if(i == A.length || j == B.length){
        return 0;
    }
    if(dp[i][j] != -1){
        return dp[i][j];
    }
    
    if(A[i] == B[j]){
        return dp[i][j] = 1 + lcs(A, B, i + 1, j + 1, dp);
    }
    else{
        return dp[i][j] = Math.max(lcs(A, B, i + 1, j, dp), lcs(A, B, i, j + 1, dp));
    }
}