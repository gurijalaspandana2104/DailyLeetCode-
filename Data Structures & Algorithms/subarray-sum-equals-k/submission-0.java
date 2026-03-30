class Solution {
    public int subarraySum(int[] nums, int k) { 
        Map<Integer,Integer>hmap=new HashMap<>();
        int prefixsum=0;
        int count=0;
        hmap.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
             prefixsum+=nums[i];
             if(hmap.containsKey(prefixsum-k))
             {
                 count+=hmap.get(prefixsum-k);
             }
             
                hmap.put(prefixsum ,hmap.getOrDefault(prefixsum ,0)+1);
             

        }
        return count;
    }
        

    }
