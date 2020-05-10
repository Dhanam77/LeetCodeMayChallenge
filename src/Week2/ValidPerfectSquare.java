package Week2;

/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

*/


class Solution {
    public boolean isPerfectSquare(int num) {
     
        if(Math.ceil(Math.sqrt(num)) == Math.floor(Math.sqrt(num)))
        {
            return true;
        }
        
           
        return false;
    }
}