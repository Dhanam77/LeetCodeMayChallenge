package Week1;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than [ n/2 ] times.

You may assume that the array is non-empty and the majority element always exist in the array.

*/
class Solution {
    public int majorityElement(int[] nums) {
        
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
           if(!map.containsKey(i)) map.put(i,1);
           else map.put(i, map.get(i) + 1);
        }
        
        
        int res = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > (int)nums.length/2)
            {
                res = entry.getKey();
                break;
            }
                
        }
        
        
        return res;
    }
}