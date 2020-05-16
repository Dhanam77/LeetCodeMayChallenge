package Week3;

/*
Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.

Here, a circular array means the end of the array connects to the beginning of the array.  (Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)

Also, a subarray may only include each element of the fixed buffer A at most once.  (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)

 

*/


class Solution {
    public int maxSubarraySumCircular(int[] A) {
        
        int sum = 0;
        int maxSum = -30000, minSum = 30000;
        int total = 0;
        int curMin = 0;
        for(int i = 0;i < A.length; i++)
        {
            sum = Math.max(A[i], sum + A[i]);
            maxSum = Math.max(sum, maxSum);
            curMin = Math.min(A[i], curMin + A[i]);
            minSum = Math.min(curMin, minSum);
           
            total += A[i];
            
        }
        
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;

        
    }
}