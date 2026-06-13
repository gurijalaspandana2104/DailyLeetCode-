class Solution {
    public int[] rearrangeArray(int[] nums) {
         int p=0;
         int n=1;
         int[] ans=new int[nums.length];
         for(int num:nums)
         {
            if(num>0)
            {
                 ans[p]=num;
                 p+=2;
            }
            if(num<0)
            {
                ans[n]=num;
                n=n+2;
            }
         }

        return  ans;
    }
}  