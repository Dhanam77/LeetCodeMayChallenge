package Week4;

//Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.


public class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        
        int zero=0;
        int one=0;
        int len=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else{
                one++;
            }
            
            if(map.containsKey(zero-one)){
                len=Math.max(len,i-map.get(zero-one));
            }else{
                map.put(zero-one,i);
            }
        }
        
        return len;
    }
}