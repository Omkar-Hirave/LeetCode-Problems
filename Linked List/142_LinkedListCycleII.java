/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head , slow = head , current = head;
        if(head == null || head.next == null){
            return null;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        while(current != slow){
            current = current.next;
            slow = slow.next;
        }
        return slow;      
    }
}