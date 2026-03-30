class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int majority1=0;
        int majority2=0;
        int vote1=0;
        int vote2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==majority1)
            {
                 
                vote1++;
            }
            else if(nums[i]==majority2)
            {
                 
                vote2++;
            }
            else if(vote1==0)
            {
                  majority1=nums[i];
                  vote1++;
            }
            else if(vote2==0)
            {
                  majority2=nums[i];
                  vote2++;
            }
            
            
             else
            {
                vote1--;
                vote2--;
            }
        } 
        List<Integer>list=new ArrayList<>();
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++)
        {
      if(nums[i]==majority1)
      {
        c1++;
      }
      else if(nums[i]==majority2)
      {
        c2++;
      }
        }
        if(c1>nums.length/3)
        {
            list.add(majority1);
        }
        if(c2>nums.length/3)
        {
            list.add(majority2);
        }
         return list;
    }
}