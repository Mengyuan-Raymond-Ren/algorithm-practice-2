/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode rootHead = new ListNode(0);
        ListNode pointer = rootHead; 
        
        if(lists == null) {
            return rootHead.next;
        }
        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode a, ListNode b) {
                if(a.val < b.val) {
                    return -1;
                }
                else if(a.val > b.val) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        };
        
        PriorityQueue<ListNode> sortedNodes = new PriorityQueue<ListNode>(comparator);
        
        for(int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while(temp != null) {
                ListNode node = new ListNode(temp.val);
                sortedNodes.offer(node);
                temp = temp.next;
            }
        }
        
        while(sortedNodes.size() != 0) {
            ListNode node = new ListNode(sortedNodes.poll().val);
            pointer.next = node;
            pointer = pointer.next;
        }
        
        return rootHead.next;
    }
}
