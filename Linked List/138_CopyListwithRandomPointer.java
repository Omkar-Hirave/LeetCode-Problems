/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        
        Node current = head;
        
        // Step 1: Duplicate each node and insert it after the original node
        while (current != null) {
            Node newNode = new Node(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }
        
        current = head;
        
        // Step 2: Update the random pointers of the duplicated nodes
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            } else {
                current.next.random = null; 
            }
            current = current.next.next;
        }
        
        Node newHead = head.next;
        current = head;
        
        // Step 3: Separate the original and duplicated linked lists
        while (current != null) {
            Node temp = current.next;
            current.next = temp.next;
            if (temp.next != null) {
                temp.next = temp.next.next;
            }
            current = current.next;          
        }
        
        return newHead;
    }
}