/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // using fast and slow pointers approach
        ListNode slow, fast;
        slow = fast = head;
        
        // check if fast is not at null
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            // if slow and fast meet, cycle found
            if(slow == fast)
                return true;
        }
        return false;
    }
}