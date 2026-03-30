class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hmap=new  HashMap<>();
        for(int i=0;i<nums.length ;i++)
        {
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1 );
        } 
         for(Map.Entry<Integer,Integer>entry:hmap.entrySet() )
         {
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>nums.length/2 )
            {
                return entry.getKey  ();  
            }
         }
         return 0;
    }
}