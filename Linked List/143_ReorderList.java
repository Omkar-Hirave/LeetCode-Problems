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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverseLinkedList(slow.next);
        slow.next = null;
        ListNode first = head;
        ListNode second = newHead;
        ListNode temp1 = null;
        ListNode temp2 = null;
        while(second != null){
            temp1 = first.next;
            temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
    public ListNode reverseLinkedList(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode nextNode = null;
        while(current != null){
            nextNode = current.next;
            current.next = prev ;
            prev = current ; 
            current = nextNode;
        }
        return prev;
    }
}