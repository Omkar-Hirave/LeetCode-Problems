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

public class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head ;
        ListNode slow = head ;
        ListNode firstNode = null;
        if(fast == null || fast.next == null){
            return head;
        }
        for(int i = 0 ; i < k - 1 ; i++){
            fast = fast.next;
        }
        firstNode = fast;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int temp = firstNode.val ;
        firstNode.val = slow.val;
        slow.val = temp;

        return head;
    }
}


