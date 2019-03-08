class MinStack {

    /** initialize your data structure here. */
    int min;
    Stack<Integer> stack;
    
    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (x <= min) {
            stack.push(min); // push min to store previous minimum value
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if (stack.pop() == min) { // if the popped out value is min
            min = stack.pop(); // pop twice to get previous minimum value
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */