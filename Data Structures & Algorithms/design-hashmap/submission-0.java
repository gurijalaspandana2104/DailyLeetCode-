class MyHashMap {
    class Entry {
    int key, value;
    Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

LinkedList<Entry>[]map;
int SIZE = 769;
    public MyHashMap() {
        map=new LinkedList[SIZE];
     for(int i=0;i<SIZE;i++)
     {
        map[i]=new LinkedList<>();
     }
        
    }
    
    public void put(int key, int value) {
        int  bucket=key%SIZE;
        LinkedList<Entry>entries=map[bucket]; 
     
        for(Entry entry:entries)
        {
         if(entry.key==key)
         {
            entry.value=value;
            return;
         }
        }
        entries.add(new Entry(key,value));

    }
    
    public int get(int key) {
        int bucket=key%SIZE;
        LinkedList<Entry>entries=map[bucket];
        for( Entry entry:entries)
        {
            if(entry.key==key)
            {
                return entry.value;
            }
        }
        return -1;
        
    }
    
    public void remove(int key) {
        int bucket=key%SIZE;
        LinkedList<Entry>entries=map[bucket];
        Iterator<Entry>it=entries.iterator();
        while(it.hasNext())
        {
            Entry entry=it.next();
             if(entry.key==key)
             {
                 it.remove();
                 return;
             }
        }
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */