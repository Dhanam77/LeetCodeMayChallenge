package Week3;


/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> list = new ArrayList<>();
    if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
    
    int[] hash = new int[256]; //character hash
    
    for (char c : p.toCharArray()) {
        hash[c]++;
    }
    int left = 0, right = 0, count = p.length();
    
    while (right < s.length()) {
         if (hash[s.charAt(right)] >= 1) {
            count--;
        }
        hash[s.charAt(right)]--;
        right++;
        
         if (count == 0) {
            list.add(left);
        }
         if (right - left == p.length() ) {
           
            if (hash[s.charAt(left)] >= 0) {
                count++;
            }
            hash[s.charAt(left)]++;
            left++;
        
        }

        
    }
        return list;
    }
}
