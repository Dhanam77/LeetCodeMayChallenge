package Week1;


/*
 	Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.


 */

class Solution {
    public int findComplement(int num) {
        
        if(num == 0)
        {
        	return 1;
        }
        
        
        int decimal = 0;
        int curr = 1;
        
        while(num != 0)
        {
            if(num % 2 == 0)
            {
            	decimal += curr;
           	}
            
            num /= 2;
            curr *= 2;
        }
        
        return decimal;
    }
}