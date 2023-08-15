class Solution {
    public Node addOne(Node head) {
        head = reverse(head);

        int carry = 1;
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;

        while (head != null) {
            int sum = head.data + carry;
            carry = sum / 10;
            head.data = sum % 10;
            current = head; 
            head = head.next;
        }

        if (carry > 0) {
            current.next = new Node(carry);
        }
        head = reverse(dummy.next);
        return head;
    }    
    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}