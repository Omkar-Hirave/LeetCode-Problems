// implemented using arrays
class MyCircularQueue {
        int front , rear;
        int maxSize;
        int queue[] ;

    public MyCircularQueue(int maxSize) {
        this.maxSize = maxSize;
        front = -1;
        rear = -1;
        queue = new int[maxSize];
    }
    
    public boolean enQueue(int value) {
        if((rear+1)% maxSize == front){//when the array is full
            return false;
        }
        if(front == -1){ // when the array is empty
            front = 0;
        }
        // When there are some elements in array
        rear = (rear + 1) % maxSize;
        queue[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if(front == -1){ //when the array is empty
            return false;
        }
        if(front == rear){ //when there is only one element in array
            front = rear = -1;
        }else{
            // When there are some elements in array
            front = (front + 1) % maxSize; 
        } 
        return true;
    }
    
    public int Front() {
        if(front == -1){ // when the array is empty there will be no front
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() { // when the array is empty there will be no rear
       if(rear == -1){
           return -1;
       }
       return queue[rear];
    }
    
    public boolean isEmpty() {
        if(front == -1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if((rear+1)% maxSize == front){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */