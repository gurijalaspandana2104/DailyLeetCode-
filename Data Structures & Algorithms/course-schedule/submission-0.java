class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     Queue<Integer>queue=new LinkedList<>();
     int[] indegree=new int[numCourses];
     List<List<Integer>>adj =new ArrayList<>(); 
     List<Integer>result=new ArrayList<>();
     for(int i=0;i<numCourses;i++)
     {
         adj.add(new ArrayList<>());
     }   
     for(int[] pre:prerequisites)
     {
        adj.get(pre[1]).add(pre[0]);
     }
     for(int i=0;i<numCourses;i++)
     {
    for(int it:adj.get(i))
     {
     indegree[it]++; 
     }
     }
     for(int i=0;i<numCourses;i++)
     {
        if(indegree[i]==0)
        {
            queue.add(i);
        }
     }
     while(!queue.isEmpty())
     {
        int node=queue.poll();
        result.add(node);
        for(int it:adj.get(node))
        {
            indegree[it]--;
            if(indegree[it]==0)
            {
                queue.add(it);
            }

        }
     }
     return result.size()==numCourses;

      
    }
}
