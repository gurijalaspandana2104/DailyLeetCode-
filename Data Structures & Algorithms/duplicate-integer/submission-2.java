class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean value=false;
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hmap.put(nums[i],(hmap.getOrDefault(nums[i],0)+1));
        }
        for(int i=0;i<nums.length;i++)
        {
            int count=hmap.get(nums[i]);
            if(count>1)
            {
                
                value=true;
                break;
               
               
            }
            else
            {
               value=false;
            }
        }
        return value;
    }
}