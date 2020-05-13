package Week2;

/*
Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

*/

class Solution {
    public String removeKdigits(String num, int k) {
        
        if(k >= num.length())
        {
            return "0";
        }
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0;i < num.length(); i++)
        {
             while(k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i))
            {
                stack.pop();
                k--;
            
            }   
            
            stack.push(num.charAt(i));
        }
        
        
        while(k > 0)
        {
            stack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        
        sb.reverse();
        int idx = 0;
        
        while(sb.length() > idx+1 && sb.charAt(idx) == '0')
        {
            idx++;
        }
        
        return sb.toString().substring(idx);
    }
}