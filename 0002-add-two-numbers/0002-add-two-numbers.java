/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class Solution {
    /* 
    IMPORTANT NOTE:
    On carrying the 1 in cases where the column adds up to something more than 9.
    
    Do modulo 10 for every outcome:
    
        Why for every sum outcome? 
        because in cases where the sum is not greater than 9, 
        you will still get the remainder/modulo that us equal to the sum. So...:
        2+4=6
        6%10=6
    
    You will also be able to handle the case where it is greater than 9, therefore
    the remainder will stay and we are able to initialize a variable that is the carry,
    where you carry the 1. So...:
    5+6= 11
    11%10=1
    Therefore...
    
      1       <- this is the carry
        5
     +  6
    ______
      1 1     <-second digit here is the remainder
    */
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            
            ListNode dummy_head = new ListNode(0);
            ListNode l3 = dummy_head;
            int carry = 0; //the val to carry over              
    
            //traverse the lists at the same time
            // while l1 or l2 is not null- we will deal with
            // the ones that are not null later
            while (l1 != null || l2 != null){
                // ternary operator: if l1 node is not null then
                // enter the value of l1 otherwise 0
                int l1_value = (l1 != null) ? l1.val : 0; 
                int l2_value = (l2 != null) ? l2.val : 0;
                int l3_value = l3.val;
    
                // l3_value contains our carry from previous run; first time around carry is likely to start at 0 because carry case was not worked through
                int sum = l1_value + l2_value + l3_value;
                //modulo to get the remainder for the values
                //you have to carry over
                int sum2= sum%10;
    
                l3.val = sum % 10;
                
                // if we have a carry always need a new node, regardless if it is the last summation or not
                if (sum > 9){
                    carry = 1;
                    //storing off carry to go on to the next node of the two linkedlists
                    ListNode new_node = new ListNode(carry);
                    l3.next = new_node;
                    l3 = l3.next;
                }
                //if we have another summation pending (l1 or l2 next is not null), create a new node for this sum
                // next node will hold your next loop through summation value
                else if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {                    
                    ListNode new_node = new ListNode(0);
                    l3.next = new_node;
                    l3 = l3.next;
                }
    
                if (l2 != null) l2 = l2.next;
                if (l1 != null) l1 = l1.next;            
            //return dummy_head.next;
            }
            return dummy_head;
        }
    }
    /*
    Basic algorithm for working with Linkedlist regardless of what you are doing

    l3 = new ListNOde(0);
    while ( l1 != null || l2 != null) {{
        l1_value = l1.val;
        l2_value = l2.val;
    
        //do something
    
        //store result
        new_node = new ListNode(sum_result);
        l3.next = new_node;
        l3 = new_node;
    
        if (l1) l1 = l1.next;
        if (l2) l2 = l2.next;
    }}
    */