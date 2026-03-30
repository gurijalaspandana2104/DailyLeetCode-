class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int right=0;
         while(right<=nums.length-1)
         {
        for(int left=  right+1;left<nums.length; left++)
        {
            if(nums[left] ==nums[right])
            {
                if(Math.abs( left-right)<=k)
                {
                 return true;
                }
                 
            }
             
        }
        right++;
         }
        return   false;
        
    }
}