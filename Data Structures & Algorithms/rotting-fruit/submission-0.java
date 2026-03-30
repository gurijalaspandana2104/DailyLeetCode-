class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]>queue=new LinkedList<>();
        int time=0;
        int i,j;
        int fresh=0;
        for(int l=0;l<grid.length;l++)
        {
            for(int m=0;m<grid[0].length;m++)
            {
                if(grid[l][m]==2)
                {
                    queue.add(new int[]{l,m});
                    
                }
                if(grid[l][m]==1)
                {
                    fresh++;
                }
            }
        }
        while(!queue.isEmpty()&&fresh>0)
        {
            int size=queue.size();
            for(int k=0;k<size;k++)
            {
           int[] cell=queue.poll();
           int  l=cell[0];
           int  r=cell[1];
           if(l-1>=0&&grid[l-1][r]==1)
             {
                grid[l-1][r]=2;
                queue.add(new int[]{l-1,r});
                fresh--;
             }
           if(l+1  <grid.length&&grid[l+1][r]==1)
             {
                grid[l+1][r]=2;
                queue.add(new int[]{l+1,r});
                fresh--;
             }
              if(r-1>=0&&grid[l ][r-1]==1)
             {
                grid[l ][r-1]=2;
                queue.add(new int[]{l,r-1});
                fresh--;
             }
           if( r+1  <grid[0].length&&grid[l ][r+1]==1)
             {
                grid[l][r+1]=2;
                queue.add(new int[]{l ,r+1});
                fresh--;
             }
             
             
        }  time++;
         
    } return fresh!=0?-1:time;
    }
}
