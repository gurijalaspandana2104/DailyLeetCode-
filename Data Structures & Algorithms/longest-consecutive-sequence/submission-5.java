class Solution {
    public int longestConsecutive(int[] nums) {
        int maxc=0;
         
         HashSet<Integer>hset=new HashSet<>();
         for(int i=0;i<nums.length;i++)
         {
             hset.add(nums[i]); 
         }
         for(int  num: hset)
         { 
            int count=1;
            if(!hset.contains(num-1))
            {
               int curr=num +1;
             while(hset.contains(curr))
             {
                 curr=curr+1;
                count++;
                 
             }   
              maxc=Math.max(count,maxc);
            }
         }
         return maxc;
    }
} 