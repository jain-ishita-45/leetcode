class MedianFinder {
    PriorityQueue<Integer> q1;
    PriorityQueue<Integer> q2;

    public MedianFinder() {
        q1=new PriorityQueue<>();
        q2=new PriorityQueue<>(Collections.reverseOrder());
        
    }
    
    public void addNum(int num) {
        if(q1.isEmpty() || q1.peek()<num)
        q1.offer(num);
        else
        q2.offer(num);
        while(q1.size()>q2.size())
        q2.offer(q1.poll());
        while(q1.size()<q2.size())
        q1.offer(q2.poll());

        
    }
    
    public double findMedian() {
        if((q1.size()>q2.size())) return q1.peek();
        return (q1.peek()+q2.peek())/2.0;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */