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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        
        // find middle
        ListNode slow, fast;
        slow = fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reverse second half
        slow.next = reverseList(slow.next);
        
        // traverse and check
        slow = slow.next;
        ListNode dummy = head;
        
        while(slow != null){
            if(dummy.val != slow.val)
                return false;
            slow = slow.next;
            dummy = dummy.next;
        }
        return true;
    }
    
    ListNode reverseList(ListNode head){
        ListNode prev, next;
        prev = next = null;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}