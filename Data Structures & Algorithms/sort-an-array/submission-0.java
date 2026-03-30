class Solution {
    public int[] sortArray(int[] nums) {
        
          mergesort(nums,nums.length);
          return nums;
        
        
    }
    public static  void mergesort(int[]nums,int numberlength)
    {
        if(numberlength<2)
        {
            return ; 
        }
        int mid=numberlength/2;
        int[] leftarr=new int[mid];
        int[] rightarr=new int[numberlength-mid ];
        for(int i=0;i<mid;i++)
        {
            leftarr[i]=nums[i];
        }
        for(int i=mid;i<numberlength;i++)
        {
            rightarr[ i-mid]=nums[i];
        }
        mergesort(leftarr ,mid);
        mergesort(rightarr,numberlength-mid); 
        merge(nums,leftarr,rightarr,mid,numberlength-mid);       
    }
   private static  void merge(int[]nums,int[] leftarr,int[] rightarr,int left,int right)
   {
    int i=0,j=0,k=0;
    while (i<left&&j<right)
    {
        if(leftarr[i]<=rightarr[ j])
        {
            nums[k++]=leftarr[i++];
        }
        else
        {
            nums[k++]=rightarr[j++];
        }
    }
    while(i<left)
    {
        nums[k++]=leftarr[ i++];
    }
    while(j<right  )
    {
        nums[k++]=  rightarr[j++];
    }

   }


}