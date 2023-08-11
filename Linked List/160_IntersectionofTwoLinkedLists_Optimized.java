/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//  Method 2 -- This is brute force approach
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode currentA = headA;
       int len1 = 0;
       while(currentA != null){
           currentA = currentA.next;
           len1++;
       }
       ListNode currentB = headB;
       int len2 = 0;
       while(currentB != null){
           currentB = currentB.next;
           len2++;
       }
        while(len1 > len2){
            headA = headA.next;
            len1--;
        }
        while(len1 < len2){
            headB = headB.next;
            len2--;
        }
       
       ListNode currentC = headA , currentD = headB;
       while(currentC != currentD){
           currentC = currentC.next;
           currentD = currentD.next;
       }
        return currentC;
    }
}