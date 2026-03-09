import java.util.*;

class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        
        if(minSt.isEmpty() || val <= minSt.peek())
            minSt.push(val);
    }
    
    public void pop() {
        if(!st.isEmpty()) {
            int x = st.pop();
            if(x == minSt.peek())
                minSt.pop();
        }
    }
    
    public int top() {
        if(!st.isEmpty())
            return st.peek();
        return -1;
    }
    
    public int getMin() {
        if(!minSt.isEmpty())
            return minSt.peek();
        return -1;
    }
}