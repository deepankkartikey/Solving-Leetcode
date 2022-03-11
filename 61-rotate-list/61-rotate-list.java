class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0) {
            return head;
        }
        int length = 0;
        
        ListNode temp = head;
        ListNode prev = null;
        
        while(temp != null) {
            prev = temp;
            length++;
            temp = temp.next;
        }
        
        k = k % length;
        
        if(k == 0) {
            return head;
        }
        
        prev.next = head;
        temp = head;
        
        k = length - k;
        
        while(k-- > 0) {
            prev = temp;
            temp = temp.next;
        }
        
        prev.next = null;
        head = temp;
        
        return head;
    }
}