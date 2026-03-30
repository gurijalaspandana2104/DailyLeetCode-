class Solution {
    public int trap(int[] height) {
        int maxright=height[height.length-1];
        int maxleft=height[0];
        int trappedwater=0;
        if(height.length==0||height.length==1||height.length==2)
        {
            return 0;
        } 
        int left= 1;
        int right=height.length-2;
         while(left<=right)
         {
            if(maxleft<maxright)
            {
                if(height[left]>=maxleft)
                {
                    maxleft=height[left];
                }
                else
                {
                    trappedwater+=Math.min(maxleft,maxright)-height[left];
                  
                }
                  left++;
            }
                else
                {
                   if(height[ right]>=maxright )
                {
                    maxright =height[ right];
                      
                }
                else
                {
                    trappedwater+=Math.min(maxleft,maxright)-height[right];
                   
                } 
                 right--; 
                }
                
            }
            return trappedwater;
         }
    }

