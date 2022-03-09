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
    public ListNode deleteDuplicates(ListNode head) {
        // special case - no element present
        if(head == null || head.next == null)
            return head;
        
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        
        // Take 3 pointers and a flag variable
        ListNode curr = head;
        ListNode prev = dummy;
        
        while(curr != null && curr.next != null){
            boolean duplicatesStarted = false;
            while(curr != null && curr.next != null && curr.val == curr.next.val){
                duplicatesStarted = true;
                curr = curr.next;
            }
            
            if(!duplicatesStarted)
                prev = prev.next;
            else
                prev.next = curr.next;
            
            curr = curr.next;
        }
        return dummy.next;
    }
}