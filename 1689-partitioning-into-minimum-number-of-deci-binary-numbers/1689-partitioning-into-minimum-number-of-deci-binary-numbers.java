class Solution {
    public int minPartitions(String n) {
        /* Example 1:
              3 2
             /   \      
            1    1
            1    1
            1    0
        */
        
        // noticed that the higher number is the one that will give the number of combinations?
        int min = 0;
        for (char c: n.toCharArray()){
            min = Math.max(min, c-'0');
        }
        return min;
    }
}