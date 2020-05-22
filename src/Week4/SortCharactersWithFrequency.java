package Week4;


/*
Given a string, sort it in decreasing order based on the frequency of characters.

*/

class Solution {
    public String frequencySort(String s) {
       
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> queue =
            new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        
        queue.addAll(map.entrySet());
        
        StringBuilder sb = new StringBuilder();
        
        while(!queue.isEmpty())
        {
            Map.Entry<Character, Integer> e = queue.poll();
            
            for(int i = 0;i < e.getValue(); i++)
            {
                sb.append(e.getKey());
            }
        }
        
        return sb.toString();
}
}