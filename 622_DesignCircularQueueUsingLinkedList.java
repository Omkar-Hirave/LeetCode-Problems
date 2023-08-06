public class Node {
    Node next;
    int val;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}
class MyCircularQueue{
    Node rear , front ; 
    int maxSize;
    public MyCircularQueue(int maxSize){
        this.maxSize = maxSize;
        this.rear = null;
        this.front = null;
    }
    public boolean isFull(){
        if(maxSize == getSize()){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }
    public boolean enQueue(int val){
        if(getSize() == maxSize){
            return false;
        }
        Node newNode = new Node(val);
        if(isEmpty()){
            front = rear = newNode;
        }
        rear.next = newNode ; 
        rear = newNode;
        rear.next = front;
        return true;
    }
    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        if(front == rear){
            front = rear = null;
        }else{
            front = front.next ;
            front = newNode;
            rear.next = front;
        }
        return true;
    }
    public int getSize(){
        if(isEmpty()){
            return 0;
        }
        Node current = front;
        int count = 1;
        while(current != rear){
            current = current.next ;
            count++;
        }
        return count;
    }
}
