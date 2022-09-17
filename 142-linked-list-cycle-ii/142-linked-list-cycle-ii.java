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
    public ListNode detectCycle(ListNode head) {
        // if list has no node or just one node
        // there is no cycle
        if(head == null || head.next == null)
            return null;
        
        // detect if list has cycle or not
        ListNode slow, fast, tmp;
        slow = fast = tmp = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            // a cycle is detected
            if(slow == fast){
                // start tmp at head and slow as it is
                // tranverse one step at a time for both pointers
                // when the pointers collide
                // that is starting point of cycle
                while(tmp != slow){
                    tmp = tmp.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}