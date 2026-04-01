class Solution {
    public  int[] swap(int[]nums,int k,int n )

    {  
        int left=k;
        int right=n;
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;
         

    }
    public void rotate(int[] nums, int k) {
          
          k=k%nums.length;
         swap(nums,0,nums.length-1);
        swap(nums,0,k-1  );
        swap(nums,k   ,nums.length-1);
    }
}