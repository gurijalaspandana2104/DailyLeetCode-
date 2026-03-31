class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>>result=new HashSet<>();
        Arrays.sort(nums);
        
         
        for(int i=0;i<nums.length-3;i++)
        {
             
            for(int j=i+1;j<nums.length-2; j++)
            {
               int left=j+1;
               int right=nums.length-1; 
                   long sum;
                while(left<right)
                {
                sum=(long)nums[left]+nums[right]+nums[i]+nums[j];
                if(sum==target)
                { 
                   result.add(Arrays.asList(nums[left],nums[i],nums[j],nums[right]));
                   left++;
                   right--; 
                }
                else if(sum<target)
                { 
                    left++;
                }
                else
                {
                    right--;
                }
                }
            
            }
        }
        
        return new ArrayList<>(result);
    }
}