package Week2;


/*
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.
*/


// TC - (log n)

class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        int lo = 0, hi = nums.length-1;
        
        while(lo < hi)
        {
           int mid = lo + (hi - lo)/2;
						   
			if(mid % 2 == 0){
				// mid is even
				if(nums[mid] == nums[mid + 1]){
					lo = mid + 2;
				}else{
					hi = mid;
				}
			}else{
				// mid is odd
				if(nums[mid] == nums[mid - 1]){
					lo = mid + 1;
				}else{
					hi = mid;
				}
			}
        }
        return nums[lo];
        
    }
}
