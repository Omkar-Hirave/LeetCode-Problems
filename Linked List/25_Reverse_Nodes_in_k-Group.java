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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        if(head == null || head.next == null || k == 1){
            return head;
        }
        
        ListNode end = head;
        ListNode beforeStart = dummy;
        int i = 0 ;
        while(end != null){
            i++;
            if(i % k == 0 ){
                ListNode start = beforeStart.next;
                ListNode temp = end.next;
                reverse(start , end);

                beforeStart.next = end;
                start.next = temp;

                beforeStart = start;
                end = temp;
            }else{
                end = end.next;
            }
        }
        return dummy.next;
   }
   private void reverse(ListNode start , ListNode end){
       ListNode prev = null;
       ListNode current = start;
       ListNode nextNode = null;
       while(prev != end){
           nextNode = current.next;
           current.next = prev;
           prev = current; 
           current = nextNode;
       }
   }
}