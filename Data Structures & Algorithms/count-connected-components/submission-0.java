class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>>adj=new ArrayList<>(); 
        boolean[] visited=new  boolean[n];
        Queue<Integer>queue=new LinkedList<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
         
       for(int[] edg:edges)
       {
        adj.get(edg[0]).add(edg[1]);
        adj.get(edg[1]).add(edg[0]);
       }
        
         
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                visited[i]=true;
                queue.add(i);
                count++;
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
            }
        
            }
        
         



return count;
    }
}
