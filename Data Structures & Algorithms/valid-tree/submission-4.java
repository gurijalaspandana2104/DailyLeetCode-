class Solution {
    public boolean validTree(int n, int[][] edges) {
     List<List<Integer>>adj=new ArrayList<>();
     if(edges.length!=n-1)return false;
     for(int i=0;i<n;i++)
     {
      adj.add(new ArrayList<>());  
     }
     for(int[] edg:edges)
     {
        adj.get(edg[0]).add(edg[1]);
        adj.get(edg[1]).add(edg[0]);
     }
    boolean[] visited=new boolean[n];
    Queue<Integer>queue=new LinkedList<>();
    queue.add(0);
    visited[0]=true;
    while(!queue.isEmpty())
    {
       int node=queue.poll();
       for(int it:adj.get(node))
       {
        if(!visited[it])
        {
            visited[it]=true;
            queue.add(it);
        }
         
       }
    }
    for(int i=0;i<n;i++)
    {
       if( visited[i]!=true)
        return false;
    }
return true;
    }
}
