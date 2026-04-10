class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num=new int[2*nums.length ];
        for(int i=0;i<2*nums.length ;i++)
        {
            num [i]= nums[i%nums.length ];
        }
        return num; 
    }
}