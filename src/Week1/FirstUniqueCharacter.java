package Week1;

/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
*/

class Solution {
    public int firstUniqChar(String s) {
        
         int[] arr = new int[26];   //Array for storing freq of 26 characters
        
         for(char c : s.toCharArray())
         {
             arr[c-'a'] += 1;       // increment frequency
         }
        
        int index = 0;
        for(char c : s.toCharArray())
        {
            if(arr[c-'a'] == 1)
            {
                return index; 
            }
            index++;
        }
        
        return -1;
        
    }
}