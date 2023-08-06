class CustomStack {
    int maxSize; 
    int stack[];
    int top;
    public CustomStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[maxSize];
        top = -1;
    }
    void push(int x){
        if(top == maxSize - 1){
            return; // Stack is full, cannot push
        }
        top++;
        stack[top] = x;
}

    int pop(){
        if(top >= 0 ){
            int poppedElement = stack[top];
            top--;
            return poppedElement;
        }
        return -1;
    }
    void increment(int k , int val){
        int end = Math.min(k , top+1);
        for(int i = 0 ; i < end ; i++){
            stack[i] += val;
        }
    }
}