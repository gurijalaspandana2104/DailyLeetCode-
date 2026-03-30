class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right=numbers.length-1;
        int left=0;
        while(left<=right)
        {
            if(numbers[left]+numbers[right]==target)
            {
                numbers[0]= left +1;
                numbers[1]= right+1 ;
                return  Arrays.copyOfRange(numbers,0,2); 
            }
            else if(numbers[left]+numbers[right]>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        } 
        return  Arrays.copyOfRange(numbers,0,2); 
    }
}
