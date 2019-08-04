/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        
        if(head == null || head.next == null) {
            return head;
        }
        
        while(true) {
            int val = temp.val;
            temp.val = temp.next.val;
            temp.next.val = val;
            
            temp = temp.next;
            if(temp.next == null)
                break;
            temp = temp.next;
            if(temp.next == null)
                break;
        }
                
        return head;
    }
}
