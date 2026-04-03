class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>result=new ArrayList<>();
        if(k==arr.length)
        { 
            for(int num: arr)
            {
                result.add(num);
            }  
            return result;
        }
        int left=0;
        int right=arr.length-1;
        while( right-left+1>k)
        {
            int ldiff=Math.abs( arr[left]-x);
            int rdiff=Math.abs( arr[right]-x);
            if(ldiff>rdiff)
            {
                left++;
            }
            else if(rdiff>ldiff)
            {
                right--;

            }
            else
            {
                right--;
            }
            

        }
        for(int i=left ;i<= right;i++)
        {
             result.add(arr[i]);
        }
        return result;
        
    }
}