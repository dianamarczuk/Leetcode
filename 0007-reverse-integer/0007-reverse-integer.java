class Solution {
    public int reverse(int x) {
        // NOTE: signed number can be positive or negative
        
        // return reverse x with digits reversed
        int y = 0;
        int i;
        
        while (x!=0){
            // modulo 10 giving me the last digit
            i = x%10;
            // then i divide x by 10 to get rid of thelast digit and traverse
            x /= 10;
            
            if(y > Integer.MAX_VALUE/10){
                return 0;
            }
            if (y < Integer.MIN_VALUE/10){
                return 0;
            }
            
            y = (y * 10)+i;
        }
        return y;
      
        }
    }
