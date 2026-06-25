class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MinStack() {
        s1=new Stack<>();
        s2=new Stack<>();
        
    }
    
    public void push(int value) {
        s1.push(value);
        if(s2.isEmpty() || value<=s2.peek())
        s2.push(value);
        
    }
    
    public void pop() {
        int x=0;
        if(!s1.isEmpty())
        x=s1.pop();
        if(x==s2.peek())
        s2.pop();
        
    }
    
    public int top() {
        if(!s1.isEmpty())
        return s1.peek();
        return -1;
        
    }
    
    public int getMin() {
         if(!s2.isEmpty())
        return s2.peek();
        return -1;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */