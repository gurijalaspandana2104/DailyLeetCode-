class Solution {
    public void  dfs(int[][]grid,int i,int j,int dis)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==-1)
        {
            return;
        }
        if(dis>grid[i][j])
        {
            return;
        }
        
          grid[i][j]=dis;
        dfs(grid ,i+1 ,j,dis+1);  
        dfs(grid ,i-1 ,j,dis+1);  
        dfs(grid ,i ,j+1,dis+1);  
        dfs(grid ,i ,j-1,dis+1);  
    }
    public void islandsAndTreasure(int[][] grid) {
        if(grid==null||grid.length==0|| grid[0].length==0)
        {
            return ;
        }
        for(int i=0;i< grid.length;i++)
        {
            for(int j=0;j< grid[0].length;j++)
            {
            if(grid[i][j]==0) 
            {
                dfs(grid,i,j,0);
            }  
            }
        }
    }
}
