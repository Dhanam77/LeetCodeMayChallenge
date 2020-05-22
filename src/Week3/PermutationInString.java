package Week3;

/*
Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int n = s1.length();
        int m = s2.length();
        
        if(m < n)
        {
            return false;
        }
        
        
        int start = 0, end = 0, counter = n;
        
       
        int[] count = new int[26];
        
        for(char c : s1.toCharArray())
        {
            count[c-'a']++;
        }
        
        for(int i = 0;i < m; i++)
        {
            count[s2.charAt(i) - 'a']--;
            if(i - n >= 0)
            {
                count[s2.charAt(i-n) - 'a']++;
            }
            if(allZeros(count))
            {
                return true;
            }
        }
        
        
        
    
        return false;
        
    }
    
    boolean allZeros(int[] count)
    {
        for(int i = 0;i < count.length; i++)
        {
            if(count[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}