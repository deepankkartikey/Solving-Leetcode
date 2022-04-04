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
    public ListNode swapNodes(ListNode head, int k) {
        k--;
        
        ListNode firstN = head;
        while(k>0){
            firstN = firstN.next;
            k--;
        }
        
        ListNode first = firstN;
        ListNode secondN = head;
        
        while(first.next!=null){
            secondN = secondN.next;
            first = first.next;
        }
        
        int temp = firstN.val;
        firstN.val = secondN.val;
        secondN.val = temp;
        return head;
    }
    
}