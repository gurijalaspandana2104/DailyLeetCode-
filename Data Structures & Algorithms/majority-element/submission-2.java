class Solution {
    public int majorityElement(int[] nums) {
        int votes=1;
        int maj=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(maj==nums[i])
            {
                votes++;
            }
           if(maj!=nums[i])
           {
            votes--;
           }
           if(votes==0)
           {
            maj=nums[i];
            votes=1;
           }
        }
        return maj;
    }
}