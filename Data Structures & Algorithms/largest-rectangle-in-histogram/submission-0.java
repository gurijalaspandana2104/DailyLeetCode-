class Solution {
    public int largestRectangleArea(int[] heights) {
        int min=Integer.MAX_VALUE;
         
        if(heights.length==0)
        {
            return 0;
        }
        if(heights.length==1)
        {
            return heights[0];
        }
        int maxarea=0;
    
        for(int i=0;i<heights.length;i++)
        { int minh= Integer.MAX_VALUE;
        for(int j=i ;j<heights.length;j++)
        {
         minh=Math.min( minh,heights[j]);
          
        
        
        int area=(j-i+1)*(minh);
          maxarea=Math.max(area,maxarea);

        }
        }
        return maxarea;
    }
}
