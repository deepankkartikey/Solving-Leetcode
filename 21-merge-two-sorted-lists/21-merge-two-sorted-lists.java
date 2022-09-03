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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        if(list1.val > list2.val){
            // swap list1 and list2 pointers
            ListNode tmp = list1;
            list1 = list2;
            list2 = tmp;
        }
        
        ListNode resHead = list1;
        
        while(list1 != null && list2 != null){
            ListNode tmp = null;
            while(list1 != null && list1.val <= list2.val){
                tmp = list1;
                list1 = list1.next;
            }
            // as soon as list1.val > list2.val, swap list1 and list2
            tmp.next = list2;
            ListNode swapPtr = list1;
            list1 = list2;
            list2 = swapPtr;
        }
        return resHead;
    }
}