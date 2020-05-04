package Week1;


/*
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true 
if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.
*/

//Total TC - O(n) + O(n) = O(2n) ~ O(n)


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    	
    	if(ransomNote.length() > magazine.length())
    	{
    		return false;
    	}
    	
    	if(ransomNote.equals(magazine))
    	{
    		return true;
    	}
        
        Map<Character,Integer> map = new HashMap<>();
        boolean res = true;
        
        for(char c : magazine.toCharArray())    //O(n)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c) + 1); 
            }
            else
            {
                map.put(c,1);
            }
        }
        
        for(char c: ransomNote.toCharArray())   //O(n)
        {
             if(map.containsKey(c) && map.get(c) >= 1)
            {
                map.put(c,map.get(c) -1); 
            }
            else
            {
                res = false;
                break;
            }
        }
        
        
        return res;
        
    }
}