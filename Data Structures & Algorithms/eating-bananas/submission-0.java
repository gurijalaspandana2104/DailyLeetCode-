class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
             max=Math.max(piles[ i],max);
        }
         
         int left= 1;
         int right=max;
         while(left<=right)
         {
            int hours=0;
            int mid=(left+right)/2;
            for(int i=0;i<piles.length;i++)
            {
            hours+=(int)Math.ceil((double)piles[i] /  mid);
            }
             
             if(hours>h)
            {
                left= 1+mid;
            }
            else{
                right=  mid-1;
            }  
            }
            return  left;
         }
          
    } 
 
