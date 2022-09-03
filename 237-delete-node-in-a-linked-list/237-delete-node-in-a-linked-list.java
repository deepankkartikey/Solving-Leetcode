/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; // copy next value of node to be deleted to overwrite value of node to be deleted
        node.next = node.next.next; // point next pointer to next of next
    }
}