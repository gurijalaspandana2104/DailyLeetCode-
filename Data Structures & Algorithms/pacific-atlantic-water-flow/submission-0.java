class Solution {
    public void dfs(int[][]heights,int i,int j,int prev, boolean[][]ocean)
    {
        if(i<0||j<0||i>=heights.length||j>=heights[0].length){
            return ;

        }
        if(heights[i][j]<prev||ocean[i][j])return;
         else
         {
            ocean[i][j]=true;
            dfs(heights,i+1,j,heights[i][j],ocean);
            dfs(heights,i-1,j,heights[i][j],ocean);
            dfs(heights,i,j+1,heights[i][j],ocean);
            dfs(heights,i,j-1,heights[i][j],ocean);
         }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>>res=new ArrayList<>();
        if(heights==null||heights.length==0||heights[0].length==0)
        {
            return res;
        }
         
          boolean[][]pacific=new  boolean[heights.length][heights[0].length];
          boolean[][]atlantic =new  boolean[heights.length][heights[0].length];
         
        for(int i=0;i<heights[0].length;i++)
        {
            dfs(heights,0,i,Integer.MIN_VALUE,pacific);
            dfs(heights,heights.length-1,i,Integer.MIN_VALUE,atlantic);
        }
        for(int i=0;i<heights.length;i++)
        {
            dfs(heights,i,0,Integer.MIN_VALUE,pacific);
            dfs(heights,i,heights[0].length -1, Integer.MIN_VALUE,atlantic);
        }
        for(int i=0;i<heights.length;i++)
        {
            for(int j=0;j<heights[0].length;j++)
            {
             if( pacific[i][j]&&atlantic[i][j])
             {
            res.add(Arrays.asList(i,j));
             }
            }
        }
        return res;
        
    }
}
