/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if( node==null)
        {
            return null;
        }
        HashMap<Node,Node>hmap=new HashMap<>();
        Queue<Node>queue=new LinkedList<>();
        Node clone =new Node(node.val);
        queue.add(node);
        hmap.put(node,clone);
        while(!queue.isEmpty())
        {
            Node curr=queue.poll();
            for(Node neighbor:curr.neighbors)
            {
                if(!hmap.containsKey(neighbor))
                {
                    hmap.put(neighbor,new Node(neighbor.val));
                     queue.add(neighbor); 
                }
                hmap.get(curr).neighbors.add(hmap.get(neighbor)); 
            }
             
        }
        return clone;

    }
}