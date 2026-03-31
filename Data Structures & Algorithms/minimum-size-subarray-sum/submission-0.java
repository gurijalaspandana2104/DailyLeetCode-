class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini=Integer.MAX_VALUE;
       int left=0;
       int sum=0;
         for(int i=0;i<nums.length;i++)
         {
            
             sum =sum+nums[i];
             while(sum>=target)
            {
             sum-=nums[left];
             mini= Math.min(mini,i-left+1);
             left++;
            }
         }
          
         return mini==Integer.MAX_VALUE?0:mini;
        
    }
}