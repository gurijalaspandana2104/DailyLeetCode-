 public class Node
{

    int key;
    int val;
    Node prev;
    Node next;
    
    public Node(int key,int val)
    {
         this.key=key;
         this.val=val;
         this.prev=null;
         this.next=null;

    }
     
}

class LRUCache {
    Node head;
    Node tail;
    int capacity;
    Map<Integer,Node>map ;     

    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(-1,-1);
       tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head; 
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        {
            return -1;
        }
        
            Node node=map.get(key);
            node.prev.next=node.next;
            node.next.prev=node.prev;

         
         node.next=head.next;
         head.next.prev=node;
         node.prev=head;
         head.next=node;
        return  node.val;
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key))
        {
            if(capacity == map.size())
            {
                Node lru=tail.prev;
          tail.prev.prev.next=tail;    
          tail.prev =tail.prev.prev;
           map.remove(lru.key);
            }
         Node node= new Node(key,value);
         head.next.prev=node;
         node.next=head.next;
         node.prev=head;
         head.next=node;
         map.put(key,node);
     
        }
        else
        {
            Node node=map.get(key);
            node.val =value;
            node.prev.next=node.next;
            node.next.prev=node.prev;
            head.next.prev=node;
         node.next=head.next;
         node.prev=head;
         head.next=node;


        }
        
    }
}
