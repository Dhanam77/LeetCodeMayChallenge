package Week1;

/*
 * 	You're given strings J representing the types of stones that are jewels, and S representing the stones you have. 
 * 	Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

	The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a 
	different type of stone from "A".
 */


public class JewelsAndStones {
	    public int numJewelsInStones(String J, String S) {
	        
	        HashMap<Character, Integer> map = new HashMap<>();
	        int count = 1, stones = 0;
	        
	        //Preparing the hashmap
	        for(int i = 0;i < S.length(); i++)
	        {
	            
	            if(map.containsKey(S.charAt(i)))
	            {
	                map.put(S.charAt(i), map.get(s.charAt(i)) + 1); 
	            }
	            else
	            {
	                map.put(S.charAt(i), 1);
	            }
	        }
	        
	        
	        
	        
	        for(int i = 0;i < J.length(); i++)
	        {
	            if(map.containsKey(J.charAt(i)))
	            {
	                stones += map.get(J.charAt(i));
	            }
	        }
	        
	        return stones;
	        
	        
	   }
}
