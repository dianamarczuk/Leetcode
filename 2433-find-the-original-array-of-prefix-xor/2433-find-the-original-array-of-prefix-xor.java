// Time Complexity: O(n) because we're just looping over pref[]

class Solution {
    public int[] findArray(int[] pref) {
        // arr is the result array of the same length as pref array
        int[] arr = new int[pref.length];
        //initialize where the bitwise fn should start
        arr[0]=pref[0];
        //initualize r as result to build on 
        int r = arr[0];
        
        //i=1 because index 0 is already solved via int r=arr[0]
        for (int i =1; i < pref.length; i++){
            arr[i] = r ^ pref[i];
            r ^= arr[i];        //going on to pref[2] save value plus the followimg one in the for loop; saved value and then on top of that, the next one

        }
        return arr;
    }}


        //importamt theory to remember:
// 5 xor 7 = 2; conversely 5 xor 2=7 ; thats why the for loop works the way it does
