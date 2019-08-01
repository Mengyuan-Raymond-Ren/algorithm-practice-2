/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        
        ListNode first = l1;
        ListNode second = l2;
        ListNode head = null;
        ListNode pointer = null;
        
        while( first != null || second != null) {
            if(head == null) {
                if(first.val > second.val) {
                    pointer = new ListNode(second.val);
                    second = second.next;
                }
                else {
                    pointer = new ListNode(first.val);
                    first = first.next;
                }
                head = pointer;
                continue;
            }
            
            if(first == null || (first != null && second != null && first.val > second.val)) {
                pointer.next = new ListNode(second.val);
                second = second.next;
                pointer = pointer.next;
            }
            else if (second == null|| (first != null && second != null && first.val <= second.val)) {
                pointer.next = new ListNode(first.val);
                first = first.next;
                pointer = pointer.next;
            }
        }
        
        return head;
    }
}
