import java.util.*;

class Solution {
    public int[] getConcatenation(int[] nums) {
        
        
        int n = nums.length;      //length
        int[] ans;  //declare ans- what we will be returning 
        for(int i=0; i<n; i++){
            //adding an end element, which defaulted to 0
            nums = Arrays.copyOf(nums, nums.length+1);
            //indexing the ith element of nums and assigned to the end
            // so num[nums.length-1] is 3 because of the added extra element above
            //add that to the end and loop through
            nums[nums.length-1]= nums[i];
        }
        ans = nums;
        return ans;
    }
    
}