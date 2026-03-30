class Solution {
    int[] parent;
    int[] rank;

    public  boolean Union(int x,int y)
    {
        int x_parent= find(x);
        int y_parent= find(y) ;
        if(x_parent==y_parent)
        {
            return  false;
        }
        if(rank[x_parent]>rank[y_parent])
        {
            parent[y_parent]=x_parent;
        }
        else if(rank[x_parent]<rank[y_parent])
        {
            parent[x_parent]=y_parent;
        }
        else
        {
            parent[x_parent]=y_parent;
            rank[y_parent]++;
        }
     return true;
    }
    public int find(int x)
    {
         
        if(parent[x]==x)
        {
            return x;
        }
        else
        {
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    public int[] findRedundantConnection(int[][] edges) {
      parent=new int[edges.length+1];
        rank=new int[edges.length+1];
        for(int i=0;i<edges.length;i++)
        {
            parent[i]=i;
        }
        for(int[] edge:edges)
        {
        if(!Union(edge[0],edge[1]))
        {
            return edge;
        }

        }
        
         
      return new int[]{};   
    }
}
