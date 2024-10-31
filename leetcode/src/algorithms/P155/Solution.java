class MinStack {
    
    private int index;
    
    private int min;
    
    private List<Integer> list;

    /** initialize your data structure here. */
    public MinStack() {
        index=0;
        min=Integer.MAX_VALUE;
        list=new ArrayList<>();
    }
    
    public void push(int x) {       
       
        list.add(index, x);
        index=index+1;
    }
    
    public void pop() {
        if (index>0){
            list.remove(index-1);
            index=index-1;           
        }
    }
    
    public int top() {
        return list.get(index-1); 
    }
    
    public int getMin() {
        min=Integer.MAX_VALUE;
        for (int i=0;i<index;i++) {
            min=Math.min(min, list.get(i));
        }
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
