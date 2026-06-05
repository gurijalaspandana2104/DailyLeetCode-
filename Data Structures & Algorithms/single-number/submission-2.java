class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hmap.put(nums[i],hmap. getOrDefault(nums[i],0)+1);
        }
        for(Integer key:hmap.keySet())
        {
           int value=hmap.get(key);
           if(value==  1)
           {
  
            return key;
           }
        }
       return -1;
}
} 