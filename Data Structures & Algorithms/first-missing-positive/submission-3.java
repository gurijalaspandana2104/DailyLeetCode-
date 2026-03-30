class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n)
        {
            int current=nums[i]-1;
            if(nums[i]<=n&&nums[i]>0&&nums[i]!=nums[current])
            {
                int temp=nums[i];
                nums[i]=nums[current];
                nums[current]=temp;
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(nums[j]==j+1 )
            {
                continue;
            }
            else
            {
                return  j+1;
            }
        }
        return n+1;
        
    }
}