class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stack=new Stack<>();
        int[]nes=new int[heights.length];
        int[]pes=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i])
            {
                stack.pop();
            }
            if( stack.isEmpty())
            {
                  pes[i]= -1;
            }
            else
            {
                  pes[i]=stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=heights.length-1;i>=0;i--)
        {
             while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                   nes[i]=heights.length;
            }
            else
            {
                  nes[i]=stack.peek();
            }
            stack.push(i);

        }
        int maxarea=0;

        for(int i=0;i<heights.length;i++)
        {
            int  area=( nes[i]- pes[i]-1)*heights[i];
            maxarea=Math.max(area,maxarea);

        }
    return maxarea;
         
    }
}
