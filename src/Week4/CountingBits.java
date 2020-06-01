package Week4;

/*

Given a non negative integer number num. For every numbers i in the range 0 <= i <= num calculate the number of 1's
 in their binary representation and return them as an array.

*/


class Solution {
    
    
    
    public int[] countBits(int num) {
        
        int[] arr = new int[num+1];
        arr[0] = 0;
        
        for(int i = 1;i <= num; i++){
            if(i % 2 == 1){
                arr[i] = (arr[(int)i/2]) + 1;
            }
            else{
                arr[i] = arr[(int)i/2];
            }
        }
        
        return arr;
    }
}