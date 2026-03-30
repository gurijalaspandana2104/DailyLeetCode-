class MyHashSet {
private  LinkedList<Integer>[]bucket; 
    public MyHashSet() {
        bucket= new LinkedList[10000]; 
    }
    
    public void add(int key) {
        int index= key%10000;
        if(bucket[index]==null)
        {
             bucket[index]=new LinkedList<>();
        }
        if(!bucket[index]. contains(key))
        {
            bucket[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index=key%10000;
        if(bucket[index] ==null)return;
        else
        { 
        bucket[index].remove(Integer.valueOf(key));
        }
        
    }
    
    public boolean contains(int key) {
        int index=key%10000;
            if (bucket[index] == null) return false;
        return bucket[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */