class MedianFinder {
    private PriorityQueue<Integer>maxheap;
       private PriorityQueue<Integer>minheap;

    public MedianFinder() {
       maxheap=new PriorityQueue<>(Collections.reverseOrder());
       minheap=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxheap.offer(num);
        minheap.offer(maxheap.poll());
        if(minheap.size()>maxheap.size())
        {
            maxheap.offer(minheap.poll());
        }
        
    }
    
    public double findMedian() {
        if(minheap.size()<maxheap.size())
        {
           return maxheap.peek();  
                 }
           else
           {
return (maxheap.peek()+minheap.peek())/2.0;
           }
    }
}
